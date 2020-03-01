package com.ms.learnapp.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SkillMapperTest {

    private SkillMapper skillMapper;

    @BeforeEach
    public void setUp() {
        skillMapper = new SkillMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        String id = "id1";
        assertThat(skillMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(skillMapper.fromId(null)).isNull();
    }
}
