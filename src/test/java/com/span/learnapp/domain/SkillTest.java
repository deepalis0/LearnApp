package com.ms.learnapp.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.ms.learnapp.web.rest.TestUtil;

public class SkillTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Skill.class);
        Skill skill1 = new Skill();
        skill1.setId("id1");
        Skill skill2 = new Skill();
        skill2.setId(skill1.getId());
        assertThat(skill1).isEqualTo(skill2);
        skill2.setId("id2");
        assertThat(skill1).isNotEqualTo(skill2);
        skill1.setId(null);
        assertThat(skill1).isNotEqualTo(skill2);
    }
}
