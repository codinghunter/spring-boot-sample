package org.htnecro.demo.web

import org.htnecro.demo.util.log
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@RestController
class UploadController {

    @PostMapping("/upload")
    fun upload(@RequestParam file: MultipartFile): String {
        log(this).info("Uploaded file : ${file.originalFilename}")
        return "success"
    }

}