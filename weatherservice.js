let app = require("express")();

app.get("/weather/:city", (req, res) => {
	setTimeout(() => {
		let { city } = req.params;
		let message = `Temperature of ${city} is ${Math.random() * 100}`;
		res.end(message);	
	}, 4000);
});

app.listen(4000);
console.log("server started in 4000");