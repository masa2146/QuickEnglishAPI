package com.bulut.quickenglishapi.controller.podcast;

import com.bulut.quickenglishapi.repository.podcast.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/podcast")
@AllArgsConstructor
public class PodcastController {

    private final PodcastL1Repository l1repo;
    private final PodcastL2Repository l2repo;
    private final PodcastL3Repository l3repo;
    private final PodcastLBRepository lBrepo;

    private final PodcastVoa1Repository voa1repo;
    private final PodcastVoa2Repository voa2repo;

    //Todo: level_1
    //Todo: level_2
    //Todo: level_3
    //Todo: level_business
    //Todo: level_voa_level_1
    //Todo: level_voa_level_2


}
