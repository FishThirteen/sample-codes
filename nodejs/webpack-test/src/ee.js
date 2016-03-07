require.ensure( [ './cc.js', './dd.js' ], function() {
    var ee = 'I\'m ee';
    console.log( ee );

    module.exports = ee;
} );
