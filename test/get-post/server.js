/**
 * socket服务器，监听8001端口
 *
 * @author shaozilee
 */

var net = require('net');
var server = net.createServer(function(socket) {
  console.log('############client connected#########');

  socket.on('end', function() {
  	console.log("############end############");
  });

  socket.on("data",function(data){
  	console.log(data.toString('utf8', 0, data.length));
  	socket.end('end\r\n');
  });

});

server.listen(8001, function() {
  console.log('server start');
});



