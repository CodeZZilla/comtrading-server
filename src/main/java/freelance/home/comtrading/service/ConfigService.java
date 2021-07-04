package freelance.home.comtrading.service;

import freelance.home.comtrading.domain.proxy.Config;
import freelance.home.comtrading.repository.ConfigRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ConfigService {

    private final ConfigRepository configRepository;

    public ConfigService(ConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    public List<String> getApiList() {
        return getConfig().getApiList();
    }
    // ------------------------------------------------------
    public Integer getProxyTimeOut() {
        return getConfig().getProxyTimeOut();
    }
    public Integer getProxyRestTime() {
        return getConfig().getProxyRestTime();
    }

    public Integer getThreadSizeMin() {
        return getConfig().getThreadSizeMin();
    }
    public Integer getThreadSizeMax() {
        return getConfig().getThreadSizeMax();
    }

    public Integer getLoadCycleTimeOut() {
        return getConfig().getLoadCycleTimeOut();
    }

    /* --------- Support methods --------- */
    private Config createDefaultConfig() {
        configRepository.deleteAll();

        Config config = new Config();

        config.setProxyTimeOut(30);
        config.setProxyRestTime(35);

        config.setThreadSizeMin(256);
        config.setThreadSizeMax(512);

        config.setLoadCycleTimeOut(35);

        config.setApiList(Arrays.asList(
                "http://localhost:8025/proxy"
        ));

        configRepository.save(config);
        return config;
    }

    private Config getConfig() {
        return configRepository.existsById(0L) ? configRepository.getOne(0L) : createDefaultConfig();
    }
}
