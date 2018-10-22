# IMPORTANTE! El mantenimiento del proyecto se movio a : `https://github.com/cloudhackgroup`

# Open Lichen App
Es el cliente para la generacion de reportes y visualizacion en mapa del los
indices calculados en el servidor.

## Android (Unica por ahora)
La app se compone de views sobre la generacion de un reporte pidiendo
acceso a la camara, el storage, y la conexion a internet (para postearlo)

El mapa es provisto por `MapBox` lo cual es necesario que como usuario del
codigo genere/utilice su propio token de acceso a dicho servicio
`https://www.mapbox.com`
Luego de generar el token hay que reemplazarlo en el campo `access_token` que se
ubica en `app/src/main/res/values/strings.xml`
