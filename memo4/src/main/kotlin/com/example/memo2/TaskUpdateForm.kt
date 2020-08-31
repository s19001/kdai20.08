package com.example.memo2

import org.hibernate.validator.constraints.NotBlank
import javax.validation.constraints.Size

class TaskUpdateForm {
    @NotBlank
    @Size(max = 20)
    var content: String? = null

    @NotBlank
    @Size(max = 1000)
    var text1: String? = null

    //var done: Boolean = false
}
