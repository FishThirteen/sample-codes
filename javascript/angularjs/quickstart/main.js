(function(app) {
  document.addEventListener( 'DOMContnetLoad', function() {
    ng.platformBrowserDynamic
      .platformBrowserDynamic()
      .bootstrapModule( app.AppModule );
  } );
})(window.app || window.app = {});
