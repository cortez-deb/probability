<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>./dashboard</title>

    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Fraunces:ital,opsz,wght@1,9..144,500&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css.css">
    </style>
</head>

<body class="mx-lg-0 mx-md-0 mx-xl-0 p-0 mb-0  border-0">


    <div class="container-fluid clearfix">

        <div class="row g-5">
            <div class="col-12">
                <h1 class="text-center shadow-sm">CYPHERS FAST FOOD</h1>
            </div>

        </div>
        <div class="row">
            <div class="col-lg-12 col-md-12 col-sm-12 shadow-sm container-fluid navbar navbar-expand flex-start" style="background-color:#f1f1f1;">

                <button type="button" class="btn col-lg-auto col-md-auto col-sm-auto">Dashboard</button>
                <button type="button" class="btn col-lg-auto col-md-auto col-sm-auto">Profile</button>

                <button type="button" class="btn col-lg-auto col-md-auto col-sm-auto">Downloads</button>
                <button type="button" class="btn col-lg-auto col-md-auto col-sm-auto">Meal Evaluation</button>
                <div class="dropdown shadow-sm position-relative col-lg-auto col-md-auto col-sm-auto end-0">
                    <button class="btn  dropdown-toggle position-relative start-50" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                        Meals
                    </button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                        <li><a class="dropdown-item shadow-sm" href="#">Breakfast</a></li>
                        <li><a class="dropdown-item  shadow-sm" href="#">Mid-morning</a></li>
                        <li><a class="dropdown-item  shadow-sm" href="#">Lunch</a></li>
                        <li><a class="dropdown-item  shadow-sm" href="#">Dinner</a></li>
                    </ul>
                </div>

            </div>
        </div>
        <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-12">
                <div class="card shadow p-3 mb-5 bg-body ">
                    <img src="./photos/jpeg.jpg" style="height:100px; width:100px" class="shadow-lg  mx-auto d-block rounded img-fluid" alt="...">
                    <div class="card-body">

                        <p class="card-text text-center">
                        <h4 class="text-center">

                            <?php
                            $name = "David";
                            $ClientType = "Client";

                            echo $name;
                            ?>
                            <br>
                            <?php
                            echo $ClientType;

                            ?>

                        </h4>
                        </p>
                    </div>
                </div>
            </div>
            <div class="col-lg-9 col-md-9 col-sm-12 shadow p-3 mb-2 bg-body  flex-start">
                <form class="row g-3 m-2">
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xl-3">
                        <label for="inputEmail4" class="form-label">Email</label>
                        <input type="email" class="form-control" id="inputEmail4">
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xl-3">
                        <label for="inputPassword4" class="form-label">Firt Name</label>
                        <input type="password" class="form-control" id="inputPassword4">
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xl-3">
                        <label for="inputAddress" class="form-label">Last Name</label>
                        <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xl-3">
                        <label for="inputAddress2" class="form-label">Address</label>
                        <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xl-3">
                        <label for="inputCity" class="form-label">City</label>
                        <input type="text" class="form-control" id="inputCity">
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xl-3">
                        <label for="inputState" class="form-label">State</label>
                        <select id="inputState" class="form-select">
                            <option selected>Choose...</option>
                            <option>...</option>
                        </select>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xl-3">
                        <label for="inputZip" class="form-label">Zip</label>
                        <input type="text" class="form-control" id="inputZip">
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xl-3 ">
                        <button type="submit" class="btn btn-primary d-flex start-100 bottom-0">Update</button>
                    </div>
                </form>

            </div>
        </div>

        <div class="row">
            <div class="container mt-5 px-5 shadow m-0">
                <div class="mb-4 col-6 bg-body">
                    <h2>Payment Method</h2>
                </div>
                <div class="row gx-5">
                    <div class="col-md-6  col-md-6 col-sm-12">
                        <div class="form card p-3  mb-3">
                            <h6 class="text-uppercase">Card Payment details</h6>
                            <div class="inputbox mt-3"> <input type="text" name="name" class="form-control" required="required"> <span>Name on card</span> </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="inputbox mt-3 mr-2"> <input type="text" name="name" class="form-control" required="required"> <i class="fa fa-credit-card"></i> <span>Card
                                            Number</span>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="d-flex flex-row">
                                        <div class="inputbox mt-3 mr-2"> <input type="text" name="name" class="form-control" required="required"> <span>Expiry</span> </div>
                                        <div class="inputbox mt-3 mr-2"> <input type="text" name="name" class="form-control" required="required"> <span>CVV</span> </div>
                                    </div>
                                </div>
                            </div>
                            <div class="mt-4 mb-4 d-flex justify-content-between">
                            <button class="btn btn-primary px-3">Submit</button>
                        </div>
                        </div>

                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-12" >
                    <div class="form card p-3  mb-3" style="background-color: rgb(2, 185, 2);">
                            <h3 class="text-uppercase" style="background-color: rgb(2, 185, 2);">
                            M<i class="fab" >
                                 <img src="./photos/mpesaIcon.jpeg" style="background-color: rgb(2, 185, 2);">
                                </i>Pesa Payment details
                            </h3>
                            <div class="mt-4 d-flex justify-content-between" style="background-color: rgb(2, 185, 2);">
                           <H4 class="text-bg-light">PAYBILL NUMBER : ### #####</H4>
                        </div>
                        <div class="mt-4 d-flex justify-content-between" style="background-color: rgb(2, 185, 2);">
                           <H4>ACCOUNT NUMBER : YOUR FIRST NAME</H4>
                        </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="container-fluid d-flex">
                <div class="row">
                    <div class="col-lg-4 col-md-4 col-sm-4 d-flex start-0" style="display:block; float:left">
                        <div class="card mb-3 shadow" style="max-width: 540px;">
                            <div class="row g-0">
                                <div class="col-md-4">
                                    <img src="/web/photos/breakfast.jpg" class="img-fluid rounded-start" style="height:100%" alt="...">
                                </div>
                                <div class="col-md-8">
                                    <div class="card-body">
                                        <h5 class="card-title">Meal Name</h5>
                                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                        <p class="card-text"><small class="text-muted">test the feeling</small></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-4">
                        <div class="card mb-3 shadow" style="max-width: 540px;">
                            <div class="row g-0">
                                <div class="col-md-4">
                                    <img src="/web/photos/lunch.jpg" class="img-fluid rounded-start" style="height:100%" alt="...">
                                </div>
                                <div class="col-md-8">
                                    <div class="card-body">
                                        <h5 class="card-title">Meal Name</h5>
                                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                        <p class="card-text"><small class="text-muted">test the feeling</small></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-4">
                        <div class="card mb-3 shadow" style="max-width: 540px;">
                            <div class="row g-0">
                                <div class="col-md-4">
                                    <img src="/web/photos/snak.jpg" class="img-fluid rounded-start" style="height:100%">
                                </div>
                                <div class="col-md-8">
                                    <div class="card-body">
                                        <h5 class="card-title">MEAL NAME</h5>
                                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                        <p class="card-text"><small class="text-muted">test the feeling</small></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>





        <div class="row">
            <footer class="col-12">footer</footer>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="js/bootstrap.bundle.js"></script>
    <script src="index.js">
        var myModal = document.getElementById('myModal')
        var myInput = document.getElementById('myInput')

        myModal.addEventListener('shown.bs.modal', function() {
            myInput.focus()
        })
    </script>
</body>

</html>