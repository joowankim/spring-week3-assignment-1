package com.codesoom.assignment.controllers;

import com.codesoom.assignment.application.TaskService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("TaskController 클래스")
class TaskControllerTest {
    @MockBean
    private TaskService taskService;

    @Nested
    @DisplayName("list 메소드는")
    class Describe_list {

        @Nested
        @DisplayName("Task 가 하나도 없을 때")
        class Context_without_any_tasks {

        }

        @Nested
        @DisplayName("Task 가 있을 때")
        class Context_with_tasks {

        }
    }

    @Nested
    @DisplayName("detail 메소드는")
    class Describe_detail {

        @Nested
        @DisplayName("찾는 id가 있을 때")
        class Context_with_target_id {

        }

        @Nested
        @DisplayName("찾는 id가 없을 때")
        class Context_without_target_id {

        }
    }

    @Nested
    @DisplayName("create 메소드는")
    class Describe_create {

    }

    @Nested
    @DisplayName("update 메소드는")
    class Describe_update {

        @Nested
        @DisplayName("변경 하려는 id가 있을 때")
        class Context_with_target_id {

        }

        @Nested
        @DisplayName("변경 하려는 id가 없을 때")
        class Context_without_target_id {

        }
    }

    @Nested
    @DisplayName("patch 메소드는")
    class Describe_patch {

        @Nested
        @DisplayName("변경 하려는 id가 있을 때")
        class Context_with_target_id {

        }

        @Nested
        @DisplayName("변경 하려는 id가 없을 때")
        class Context_without_target_id {

        }
    }

    @Nested
    @DisplayName("delete 메소드는")
    class Describe_delete {

        @Nested
        @DisplayName("삭제 하려는 id가 있을 때")
        class Context_with_target_id {

        }

        @Nested
        @DisplayName("삭제 하려는 id가 없을 때")
        class Context_without_target_id {

        }
    }
}