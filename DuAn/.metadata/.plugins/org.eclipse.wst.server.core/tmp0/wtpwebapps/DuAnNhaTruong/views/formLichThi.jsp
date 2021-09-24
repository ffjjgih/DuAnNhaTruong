<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lịch thi</title>
    <link rel="stylesheet" href="./assets/lichThi.css">
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
            <div class="container_header">
                <table class="tblTT">
                    <tr>
                        <td>BLOCK 1- KÌ SPRING</td>
                        <td>PHÒNG THI: ONLINE</td>
                        <td>GIỜ THI: 16:20 TO 18:20</td>
                    </tr>
                    <tr>
                        <td>MÃ THI: TIN HỌC</td>
                        <td>NGÀY THI: 04/03/2021</td>
                        <td></td>
                    </tr>
                </table>
            </div>
            <div class="container_body">
                <table class="table tbl_body">
                    <thead class="table-danger">
                        <tr>
                          <th scope="col">TT</th>
                          <th scope="col">MSSV</th>
                          <th scope="col">HỌ TÊN</th>
                          <th scope="col">LỚP</th>
                          <th scope="col">KÝ TÊN</th>
                          <th scope="col">ĐIỂM</th>
                          <th scope="col">GHI CHÚ</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <th scope="row">1</th>
                          <td>PH17388</td>
                          <td>NGUYỄN LÊ HẢI</td>
                          <td>PT16309</td>
                          <td>HẢI</td>
                          <td>10</td>
                          <td>PERFECT</td>
                        </tr>
                        <tr>
                            <th scope="row">1</th>
                          <td>PH17388</td>
                          <td>NGUYỄN LÊ HẢI</td>
                          <td>PT16309</td>
                          <td>HẢI</td>
                          <td>10</td>
                          <td>PERFECT</td>
                        </tr>
                        <tr>
                            <th scope="row">1</th>
                          <td>PH17388</td>
                          <td>NGUYỄN LÊ HẢI</td>
                          <td>PT16309</td>
                          <td>HẢI</td>
                          <td>10</td>
                          <td>PERFECT</td>
                        </tr>
                      </tbody>
                </table>
            </div>
        </div>
        <footer class="footer">
            <div class="footer_button">
                <button class="btn_download js-btn_download">DOWNLOAD</button>
            </div>
        </footer>

        <div class="modal_download js-modal_download">
            <div class="modal_download-container js-modal_download-container">
                <div class="header-modal_dowload-container">
                    <img class="btn_close" src="./assets/image/left-arrow.png" alt="">
                </div>
                <div class="body-modal_dowload-container">
                    <img src="./assets/image/241400644_4384520114929340_1276692022253364513_n.png" alt="">
                </div>
                <div class="footer-modal_dowload-container">
                    <button class="modal-btn_download">DOWNLOAD</button>
                </div>
            </div>
        </div>
    </div>
    <script>
        const downLoadBtn = document.querySelector('.js-btn_download');
        const modal = document.querySelector('.js-modal_download');
        const btnClose = document.querySelector('.btn_close');
        const modalContainer = document.querySelector('.js-modal_download-container');

        function showModal(){
            modal.classList.add('open');
        }
        function hideModal(){
            modal.classList.remove('open');
        }

        downLoadBtn.addEventListener('click', showModal);

        btnClose.addEventListener('click', hideModal);

        modalContainer.addEventListener('click', function(event){
            event.stopPropagation();
        })
    </script>
</body>
</html>