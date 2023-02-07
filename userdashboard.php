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
    <link rel="stylesheet" href="sidebar.css">
    </style>
</head>

<body class="mx-lg-0 mx-md-0 mx-xl-0 p-0 mb-0  border-0">


    <div class="container-fluid">
        <div class="row">
            <div class="col-12">
                <h1 class="text-center shadow-sm">CYPHERS FAST FOOD</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-2 col-md-2 col-sm-12 shadow-sm"  style="background-color:#f1f1f1;">
                <div class="shadow-sm col-12">
                <button type="button" class="btn col-12">Dashboard</button>
                <button type="button" class="btn col-12">Profile</button>
                <button type="button" class="btn col-12">Meals</button>
                <button type="button" class="btn col-12">Downloads</button>
                <button type="button" class="btn col-12">Meal Evaluation</button>
                <div class="dropdown shadow-sm position-relative col-12">
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
            <div class="col-lg-10 col-md-10 col-sm-12">
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
                    <div class="col-lg-9 col-md-9 col-sm-12 shadow p-3 mb-5 bg-body ">
                        <form class="row g-3" style="height:20rem">
                        <div class="col-lg-10">
                            <h3>
                            PERSONAL DETAILS-CLIENT
                            </h3>
                        </div>
                        <div class="col-lg-2">
                            <button type="button" class="btn shadow-sm bg-body bg-transparent" style="color:lightslategray;">
                                UPDATE
                            </button>
                        </div>
                            <div class="col-lg-3 col-md-3 col-sm-12">
                                <label for="firstname" class="form-label shadow-sm">First Name</label>
                                <input type="text" class="form-control" id="firstname">
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-12">
                                <label for="secondname" class="form-label shadow-sm">Second Name</label>
                                <input type="text" class="form-control" id="secondname">
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-12">
                                <label for="inputAddress" class="form-label shadow-sm">Address</label>
                                <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-12">
                                <label for="inputAddress2" class="form-label shadow-sm">Address 2</label>
                                <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-12">
                                <label for="inputTown" class="form-label shadow-sm">Town / City</label>
                                <input type="text" class="form-control" id="inputTown">
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-12">
                                <label for="inputStreet" class="form-label shadow-sm">Street</label>
                                <input type="text" class="form-control" id="inputStreet">
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-12">
                                <label for="inputZip" class="form-label shadow-sm">Zip</label>
                                <input type="text" class="form-control" id="inputZip">
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-12">
                                <label for="phone" class="form-label shadow-sm">Phone Number</label>
                                <input type="number" class="form-control" id="phone" placeholder="+254">
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </div>
        <div class="row position-absolute bottom-0">
            <footer class="col-12 position-absolute bottom-0">footer</footer>
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