require.ensure( [ './aa.js', './bb.js' ], function() {
    var dd = 'I\'m dd';
    console.log( dd );

    module.exports = dd;
} );
