@import objects.Animal
@param Animal animal

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>

<body>
  @if(animal.getName().equals("dog"))
    This animal is a dog
  @elseif(animal.getName().equals("cat"))
    This animal is a cat and is ${animal.getColor()}!
  @else
    I don't know what animal this is!
  @endif
</body>