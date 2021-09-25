<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sắp xếp lịch thi</title>
    <link rel="stylesheet" href="./assets/upLoadDiem.css">
    <link rel="stylesheet" href="./assets/base.css">
    <link rel="stylesheet" href="./assets/grid.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
        integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<body>
    <div id="app">
        <header class="header">
            <div class="grid wide">
                <img class="header_img" src="./assets/image/Poly.png" alt="">
                <img class="header_icon_user" src="./assets/image/user.png" alt="">
            </div>
        </header>
        <div class="container">
            <div class="row">
                <div class="col">
                </div>
                <div class="col container_middle">
                    <h1 class="h1 container_header">
                        UPLOAD FILE ĐIỂM
                    </h1>
                    <form action="">
                        <div class="container_body">
                            <div class="container_body-button">
                                <input type="file" id="UploadFileInput" class="btnFile"></input>
                            </div>
                            <div class="container_body-cbb">
                                <div class="rdo-group " id="modalCBB">
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="inlineRadioOptions"
                                            id="inlineRadio1" value="option1" checked>
                                        <label class="form-check-label" for="inlineRadio1">ĐIỂM QUIZ</label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="inlineRadioOptions"
                                            id="inlineRadio2" value="option2">
                                        <label class="form-check-label" for="inlineRadio2">ĐIỂM ONLINE</label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="inlineRadioOptions"
                                            id="inlineRadio3" value="option3">
                                        <label class="form-check-label" for="inlineRadio3">ĐIỂM DANH</label>
                                    </div>
                                </div>
                            </div>
                            <div class="container_body-submit">
                                <button class="btn_submit">SUBMIT</button>
                            </div>
                        </div>
                    </form>

                </div>
                <div class="col">
                </div>
                <form action="">
                    <div class="container_footer">
                        <div class="container_footer-download">
                            <a href=""><img src="./assets/image/241315670_374048297772326_2602951087702346768_n.png"
                                    alt=""></a>
                        </div>
                    </div>
                </form>

            </div>

        </div>
    </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
</body>

</html>