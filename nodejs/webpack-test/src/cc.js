require.ensure( [ './aa.js', './bb.js' ], function() {
    var cc = 'I\'m cc';
    console.log( cc );

    module.exports = cc;
} );
