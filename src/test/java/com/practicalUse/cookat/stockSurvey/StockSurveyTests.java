package com.practicalUse.cookat.stockSurvey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
public class StockSurveyTests {

    @Autowired
    private StockSurveyService stockSurveyService;

    private static Stream<Arguments> updatecookat() {
        return Stream.of(
                Arguments.of("렌지쿠캣 꼬치없는 쯔란 양꼬치 150g", 10),
                Arguments.of("쿠캣메이드 딸기쏙우유 찹쌀떡 540g", 20),
                Arguments.of("원팩쿠캣 점보 매콤 마늘 뼈찜 1.4kg",15),
                Arguments.of("오모리 김치 어묵탕 600g",22),
                Arguments.of("모터시티 디트로이트 피자 4종",9),
                Arguments.of("쿠캣메이드 밥도둑 6종",24)

        );
    }

    @ParameterizedTest
    @MethodSource("updatecookat")
    void testUpdateStock(String cookatName, int updatecookat) {

        //given

        //when

        //then

        Assertions.assertDoesNotThrow(
                () -> stockSurveyService.updateStock(cookatName, updatecookat)
        );
    }

}
