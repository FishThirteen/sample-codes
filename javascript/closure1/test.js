var delay = function(fn, duration) {
  return function() {
    var self = this, args = arguments;
    setTimeout(function() {
        fn.apply(self, args)
      }, duration);
  };

};

var delayAdd = delay(function(a, b) {
  alert(a + b);
  }, 2000);

delayAdd(2, 3);
