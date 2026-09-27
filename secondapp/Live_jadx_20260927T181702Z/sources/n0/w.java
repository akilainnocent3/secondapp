package n0;

import com.yandex.div.core.timer.TimerController;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f115769a = "CUSTOM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f115770b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f115771c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f115772d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f115773e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f115774f = 100;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f115775g = 101;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        public static final String A = "rotationX";
        public static final String B = "rotationY";
        public static final String C = "rotationZ";
        public static final String D = "scaleX";
        public static final String E = "scaleY";
        public static final String F = "pivotX";
        public static final String G = "pivotY";
        public static final String H = "progress";
        public static final String I = "pathRotate";
        public static final String J = "easing";
        public static final String K = "CUSTOM";
        public static final String M = "target";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f115776a = "KeyAttributes";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f115777b = 301;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f115778c = 302;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f115779d = 303;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f115780e = 304;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f115781f = 305;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f115782g = 306;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f115783h = 307;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f115784i = 308;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f115785j = 309;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f115786k = 310;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f115787l = 311;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f115788m = 312;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f115789n = 313;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f115790o = 314;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f115791p = 315;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f115792q = 316;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f115793r = 317;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f115794s = 318;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f115795t = "curveFit";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f115796u = "visibility";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f115797v = "alpha";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f115798w = "translationX";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f115799x = "translationY";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f115800y = "translationZ";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f115801z = "elevation";
        public static final String L = "frame";
        public static final String N = "pivotTarget";
        public static final String[] O = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", L, "target", N};
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f115802a = "Custom";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f115803b = "integer";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f115805d = "color";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f115806e = "string";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f115807f = "boolean";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f115811j = 900;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f115812k = 901;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f115813l = 902;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f115814m = 903;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f115815n = 904;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f115816o = 905;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f115817p = 906;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f115804c = "float";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f115808g = "dimension";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f115809h = "reference";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String[] f115810i = {f115804c, "color", "string", "boolean", f115808g, f115809h};
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        public static final String A = "translationX";
        public static final String B = "translationY";
        public static final String C = "translationZ";
        public static final String D = "elevation";
        public static final String E = "rotationX";
        public static final String F = "rotationY";
        public static final String G = "rotationZ";
        public static final String H = "scaleX";
        public static final String I = "scaleY";
        public static final String J = "pivotX";
        public static final String K = "pivotY";
        public static final String L = "progress";
        public static final String M = "pathRotate";
        public static final String N = "easing";
        public static final String O = "waveShape";
        public static final String R = "offset";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f115818a = "KeyCycle";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f115819b = 401;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f115820c = 402;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f115821d = 403;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f115822e = 304;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f115823f = 305;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f115824g = 306;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f115825h = 307;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f115826i = 308;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f115827j = 309;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f115828k = 310;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f115829l = 311;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f115830m = 312;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f115831n = 313;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f115832o = 314;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f115833p = 315;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f115834q = 416;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f115835r = 420;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f115836s = 421;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f115837t = 422;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f115838u = 423;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f115839v = 424;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f115840w = 425;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f115841x = "curveFit";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f115842y = "visibility";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f115843z = "alpha";
        public static final String P = "customWave";
        public static final String Q = "period";
        public static final String S = "phase";
        public static final String[] T = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", P, Q, "offset", S};
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f115844a = "MotionScene";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f115847d = 600;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f115848e = 601;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f115845b = "defaultDuration";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f115846c = "layoutDuringTransition";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String[] f115849f = {f115845b, f115846c};
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        public static final int A = 611;
        public static final int B = 612;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f115850a = "Motion";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f115851b = "Stagger";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f115852c = "PathRotate";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f115853d = "QuantizeMotionPhase";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f115854e = "TransitionEasing";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f115855f = "QuantizeInterpolator";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f115856g = "AnimateRelativeTo";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f115857h = "AnimateCircleAngleTo";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f115858i = "PathMotionArc";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f115859j = "DrawPath";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f115860k = "PolarRelativeTo";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f115861l = "QuantizeMotionSteps";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f115862m = "QuantizeInterpolatorType";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f115863n = "QuantizeInterpolatorID";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String[] f115864o = {f115851b, f115852c, f115853d, f115854e, f115855f, f115856g, f115857h, f115858i, f115859j, f115860k, f115861l, f115862m, f115863n};

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f115865p = 600;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f115866q = 601;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f115867r = 602;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f115868s = 603;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f115869t = 604;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f115870u = 605;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f115871v = 606;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f115872w = 607;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f115873x = 608;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f115874y = 609;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f115875z = 610;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f115876a = "dragscale";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f115877b = "dragthreshold";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f115878c = "maxvelocity";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f115879d = "maxacceleration";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f115880e = "springmass";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f115881f = "springstiffness";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f115882g = "springdamping";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f115883h = "springstopthreshold";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f115884i = "dragdirection";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f115885j = "touchanchorid";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f115886k = "touchanchorside";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f115887l = "rotationcenterid";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f115888m = "touchregionid";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f115889n = "limitboundsto";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f115890o = "movewhenscrollattop";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f115891p = "ontouchup";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f115893r = "springboundary";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f115895t = "autocompletemode";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f115897v = "nestedscrollflags";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String[] f115892q = {"autoComplete", "autoCompleteToStart", "autoCompleteToEnd", TimerController.STOP_COMMAND, n0.d.f115549i, "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd"};

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String[] f115894s = {n0.d.f115554n, "bounceStart", "bounceEnd", "bounceBoth"};

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String[] f115896u = {"continuousVelocity", "spring"};

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String[] f115898w = {"none", "disablePostScroll", "disableScroll", "supportScrollUp"};
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f115899a = "KeyPosition";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f115900b = "transitionEasing";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f115901c = "drawPath";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f115902d = "percentWidth";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f115903e = "percentHeight";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f115904f = "sizePercent";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f115905g = "percentX";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f115906h = "percentY";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f115907i = 501;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f115908j = 502;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f115909k = 503;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f115910l = 504;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f115911m = 505;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f115912n = 506;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f115913o = 507;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f115914p = 508;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f115915q = 509;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f115916r = 510;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String[] f115917s = {"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f115918a = "Transitions";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f115919b = "duration";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f115920c = "from";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f115921d = "to";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f115927j = 700;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f115928k = 701;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f115929l = 702;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f115930m = 509;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f115931n = 704;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f115932o = 705;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f115933p = 706;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f115934q = 707;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f115922e = "pathMotionArc";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f115923f = "autoTransition";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f115924g = "motionInterpolator";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f115925h = "staggered";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f115926i = "transitionFlags";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String[] f115935r = {"duration", "from", "to", f115922e, f115923f, f115924g, f115925h, "from", f115926i};
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f115936a = "KeyTrigger";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f115937b = "viewTransitionOnCross";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f115938c = "viewTransitionOnPositiveCross";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f115939d = "viewTransitionOnNegativeCross";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f115940e = "postLayout";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f115941f = "triggerSlack";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f115942g = "triggerCollisionView";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f115943h = "triggerCollisionId";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f115944i = "triggerID";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f115945j = "positiveCross";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f115946k = "negativeCross";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f115947l = "triggerReceiver";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f115948m = "CROSS";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String[] f115949n = {"viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS"};

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f115950o = 301;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f115951p = 302;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f115952q = 303;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f115953r = 304;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f115954s = 305;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f115955t = 306;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f115956u = 307;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f115957v = 308;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f115958w = 309;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f115959x = 310;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f115960y = 311;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f115961z = 312;
    }

    boolean a(int i10, int i11);

    boolean b(int i10, float f10);

    boolean c(int i10, boolean z10);

    boolean d(int i10, String str);

    int e(String str);
}
