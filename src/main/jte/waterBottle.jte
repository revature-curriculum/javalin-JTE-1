@import objects.WaterBottle
@param WaterBottle waterBottle

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>

<body>
  @if(waterBottle.getAmount() <= 0)
    I'm dying of thirst.
  @elseif(waterBottle.getAmount() == 100)
    I'm always hydrated.
  @else
    I am content.
  @endif
</body>