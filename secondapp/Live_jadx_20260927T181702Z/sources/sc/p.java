package sc;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.ironsource.C4235d4;
import com.ironsource.G5;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f130182j = "SVGParser";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f130183k = "http://www.w3.org/2000/svg";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f130184l = "http://www.w3.org/1999/xlink";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f130185m = "http://www.w3.org/TR/SVG11/feature#";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f130186n = "xml-stylesheet";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f130187o = "type";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f130188p = "alternate";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f130189q = "href";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f130190r = "media";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f130191s = "all";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f130192t = "no";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f130193u = 4096;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f130194v = "none";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f130195w = "currentColor";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f130196x = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f130197y = "|visible|hidden|collapse|";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f130201d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f130198a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k.j0 f130199b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f130200c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f130202e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f130203f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StringBuilder f130204g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f130205h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StringBuilder f130206i = null;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f130208b;

        static {
            int[] iArr = new int[g.values().length];
            f130208b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f130208b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f130208b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f130208b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f130208b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f130208b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f130208b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f130208b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f130208b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f130208b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f130208b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f130208b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f130208b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f130208b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f130208b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f130208b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f130208b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f130208b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f130208b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f130208b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f130208b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f130208b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f130208b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f130208b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f130208b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f130208b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f130208b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f130208b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f130208b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f130208b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f130208b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f130208b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f130208b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f130208b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f130208b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f130208b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f130208b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f130208b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f130208b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f130208b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f130208b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f130208b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f130208b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f130208b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f130208b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f130208b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f130208b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f130208b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f130208b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f130208b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f130208b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f130208b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f130208b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f130208b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f130208b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f130208b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f130208b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f130208b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f130208b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f130208b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f130208b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f130208b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f130208b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f130208b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f130208b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f130208b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f130208b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f130208b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f130208b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f130208b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f130208b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f130208b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f130208b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f130208b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f130208b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f130208b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f130208b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f130208b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f130208b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f130208b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f130208b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f130208b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f130208b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f130208b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f130208b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f130208b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f130208b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f130208b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f130208b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f130207a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f130207a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f130207a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f130207a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f130207a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f130207a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f130207a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f130207a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f130207a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f130207a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f130207a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f130207a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f130207a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f130207a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f130207a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f130207a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f130207a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f130207a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f130207a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f130207a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f130207a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f130207a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f130207a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f130207a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f130207a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f130207a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f130207a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f130207a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f130207a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f130207a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f130207a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, sc.h.a> f130209a;

        static {
            HashMap map = new HashMap(10);
            f130209a = map;
            map.put("none", sc.h.a.none);
            map.put("xMinYMin", sc.h.a.xMinYMin);
            map.put("xMidYMin", sc.h.a.xMidYMin);
            map.put("xMaxYMin", sc.h.a.xMaxYMin);
            map.put("xMinYMid", sc.h.a.xMinYMid);
            map.put("xMidYMid", sc.h.a.xMidYMid);
            map.put("xMaxYMid", sc.h.a.xMaxYMid);
            map.put("xMinYMax", sc.h.a.xMinYMax);
            map.put("xMidYMax", sc.h.a.xMidYMax);
            map.put("xMaxYMax", sc.h.a.xMaxYMax);
        }

        public static sc.h.a a(String str) {
            return f130209a.get(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, Integer> f130210a;

        static {
            HashMap map = new HashMap(47);
            f130210a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", -16777216);
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", Integer.valueOf(p1.a.f120313c));
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put(C4235d4.i.T, 0);
        }

        public static Integer a(String str) {
            return f130210a.get(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, k.p> f130211a;

        static {
            HashMap map = new HashMap(9);
            f130211a = map;
            k.d1 d1Var = k.d1.pt;
            map.put("xx-small", new k.p(0.694f, d1Var));
            map.put("x-small", new k.p(0.833f, d1Var));
            map.put("small", new k.p(10.0f, d1Var));
            map.put("medium", new k.p(12.0f, d1Var));
            map.put("large", new k.p(14.4f, d1Var));
            map.put("x-large", new k.p(17.3f, d1Var));
            map.put("xx-large", new k.p(20.7f, d1Var));
            k.d1 d1Var2 = k.d1.percent;
            map.put("smaller", new k.p(83.33f, d1Var2));
            map.put("larger", new k.p(120.0f, d1Var2));
        }

        public static k.p a(String str) {
            return f130211a.get(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, Integer> f130212a;

        static {
            HashMap map = new HashMap(13);
            f130212a = map;
            map.put("normal", 400);
            map.put("bold", 700);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put(StatisticData.ERROR_CODE_NOT_FOUND, 100);
            map.put("200", 200);
            map.put("300", 300);
            map.put("400", 400);
            map.put("500", 500);
            map.put("600", 600);
            map.put("700", 700);
            map.put("800", 800);
            map.put("900", 900);
        }

        public static Integer a(String str) {
            return f130212a.get(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f extends DefaultHandler2 {
        public f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) throws SAXException {
            p.this.d1(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() throws SAXException {
            p.this.p();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            p.this.q(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) throws SAXException {
            p.this.s(str, p.this.y0(new i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() throws SAXException {
            p.this.X0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            p.this.Y0(str, str2, str3, attributes);
        }

        public /* synthetic */ f(p pVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        public static final Map<String, g> P0 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    P0.put(sc.c.f129750g, gVar);
                } else {
                    if (gVar != UNSUPPORTED) {
                        P0.put(gVar.name().replace('_', '-'), gVar);
                    }
                }
            }
        }

        public static g a(String str) {
            g gVar = P0.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        public static final Map<String, h> H = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    H.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    H.put(hVar.name(), hVar);
                }
            }
        }

        public static h a(String str) {
            h hVar = H.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f130290a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f130292c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f130291b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public sc.g f130293d = new sc.g();

        public i(String str) {
            this.f130292c = 0;
            String strTrim = str.trim();
            this.f130290a = strTrim;
            this.f130292c = strTrim.length();
        }

        public void A() {
            while (true) {
                int i10 = this.f130291b;
                if (i10 >= this.f130292c || !k(this.f130290a.charAt(i10))) {
                    return;
                } else {
                    this.f130291b++;
                }
            }
        }

        public int a() {
            int i10 = this.f130291b;
            int i11 = this.f130292c;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.f130291b = i12;
            if (i12 < i11) {
                return this.f130290a.charAt(i12);
            }
            return -1;
        }

        public String b() {
            int i10 = this.f130291b;
            while (!h() && !k(this.f130290a.charAt(this.f130291b))) {
                this.f130291b++;
            }
            String strSubstring = this.f130290a.substring(i10, this.f130291b);
            this.f130291b = i10;
            return strSubstring;
        }

        public Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        public float d(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        public float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        public boolean f(char c10) {
            int i10 = this.f130291b;
            boolean z10 = i10 < this.f130292c && this.f130290a.charAt(i10) == c10;
            if (z10) {
                this.f130291b++;
            }
            return z10;
        }

        public boolean g(String str) {
            int length = str.length();
            int i10 = this.f130291b;
            boolean z10 = i10 <= this.f130292c - length && this.f130290a.substring(i10, i10 + length).equals(str);
            if (z10) {
                this.f130291b += length;
            }
            return z10;
        }

        public boolean h() {
            return this.f130291b == this.f130292c;
        }

        public boolean i() {
            int i10 = this.f130291b;
            if (i10 == this.f130292c) {
                return false;
            }
            char cCharAt = this.f130290a.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'z') {
                return cCharAt >= 'A' && cCharAt <= 'Z';
            }
            return true;
        }

        public boolean j(int i10) {
            return i10 == 10 || i10 == 13;
        }

        public boolean k(int i10) {
            return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
        }

        public Integer l() {
            int i10 = this.f130291b;
            if (i10 == this.f130292c) {
                return null;
            }
            String str = this.f130290a;
            this.f130291b = i10 + 1;
            return Integer.valueOf(str.charAt(i10));
        }

        public Boolean m() {
            int i10 = this.f130291b;
            if (i10 == this.f130292c) {
                return null;
            }
            char cCharAt = this.f130290a.charAt(i10);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f130291b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        public float n() {
            float fB = this.f130293d.b(this.f130290a, this.f130291b, this.f130292c);
            if (!Float.isNaN(fB)) {
                this.f130291b = this.f130293d.a();
            }
            return fB;
        }

        public String o() {
            if (h()) {
                return null;
            }
            int i10 = this.f130291b;
            int iCharAt = this.f130290a.charAt(i10);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = a();
            }
            int i11 = this.f130291b;
            while (k(iCharAt)) {
                iCharAt = a();
            }
            if (iCharAt == 40) {
                this.f130291b++;
                return this.f130290a.substring(i10, i11);
            }
            this.f130291b = i10;
            return null;
        }

        public k.p p() {
            float fN = n();
            if (Float.isNaN(fN)) {
                return null;
            }
            k.d1 d1VarV = v();
            return d1VarV == null ? new k.p(fN, k.d1.px) : new k.p(fN, d1VarV);
        }

        public String q() {
            if (h()) {
                return null;
            }
            int i10 = this.f130291b;
            char cCharAt = this.f130290a.charAt(i10);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.f130291b = i10;
                return null;
            }
            int i11 = this.f130291b;
            this.f130291b = i11 + 1;
            return this.f130290a.substring(i10 + 1, i11);
        }

        public String r() {
            return t(' ', false);
        }

        public String s(char c10) {
            return t(c10, false);
        }

        public String t(char c10, boolean z10) {
            if (h()) {
                return null;
            }
            char cCharAt = this.f130290a.charAt(this.f130291b);
            if ((!z10 && k(cCharAt)) || cCharAt == c10) {
                return null;
            }
            int i10 = this.f130291b;
            int iA = a();
            while (iA != -1 && iA != c10 && (z10 || !k(iA))) {
                iA = a();
            }
            return this.f130290a.substring(i10, this.f130291b);
        }

        public String u(char c10) {
            return t(c10, true);
        }

        public k.d1 v() {
            if (h()) {
                return null;
            }
            if (this.f130290a.charAt(this.f130291b) == '%') {
                this.f130291b++;
                return k.d1.percent;
            }
            int i10 = this.f130291b;
            if (i10 > this.f130292c - 2) {
                return null;
            }
            try {
                k.d1 d1VarValueOf = k.d1.valueOf(this.f130290a.substring(i10, i10 + 2).toLowerCase(Locale.US));
                this.f130291b += 2;
                return d1VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public String w() {
            if (h()) {
                return null;
            }
            int i10 = this.f130291b;
            char cCharAt = this.f130290a.charAt(i10);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.f130291b = i10;
                return null;
            }
            int iA = a();
            while (true) {
                if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                    break;
                }
                iA = a();
            }
            return this.f130290a.substring(i10, this.f130291b);
        }

        public float x() {
            z();
            float fB = this.f130293d.b(this.f130290a, this.f130291b, this.f130292c);
            if (!Float.isNaN(fB)) {
                this.f130291b = this.f130293d.a();
            }
            return fB;
        }

        public String y() {
            if (h()) {
                return null;
            }
            int i10 = this.f130291b;
            this.f130291b = this.f130292c;
            return this.f130290a.substring(i10);
        }

        public boolean z() {
            A();
            int i10 = this.f130291b;
            if (i10 == this.f130292c || this.f130290a.charAt(i10) != ',') {
                return false;
            }
            this.f130291b++;
            A();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class j implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public XmlPullParser f130294a;

        public j(XmlPullParser xmlPullParser) {
            this.f130294a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f130294a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i10) {
            return this.f130294a.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i10) {
            String attributeName = this.f130294a.getAttributeName(i10);
            if (this.f130294a.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return this.f130294a.getAttributePrefix(i10) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i10) {
            return this.f130294a.getAttributeNamespace(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i10) {
            return this.f130294a.getAttributeValue(i10);
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }
    }

    public static Set<String> A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            if (strR.startsWith(f130185m)) {
                hashSet.add(strR.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.A();
        }
        return hashSet;
    }

    public static Set<String> B0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            hashSet.add(iVar.r());
            iVar.A();
        }
        return hashSet;
    }

    public static k.p[] C0(String str) {
        k.p pVarP;
        i iVar = new i(str);
        iVar.A();
        if (iVar.h() || (pVarP = iVar.p()) == null || pVarP.g()) {
            return null;
        }
        float fA = pVarP.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pVarP);
        while (!iVar.h()) {
            iVar.z();
            k.p pVarP2 = iVar.p();
            if (pVarP2 == null || pVarP2.g()) {
                return null;
            }
            arrayList.add(pVarP2);
            fA += pVarP2.a();
        }
        if (fA == 0.0f) {
            return null;
        }
        return (k.p[]) arrayList.toArray(new k.p[arrayList.size()]);
    }

    public static k.e0.c D0(String str) {
        if ("butt".equals(str)) {
            return k.e0.c.Butt;
        }
        if ("round".equals(str)) {
            return k.e0.c.Round;
        }
        if ("square".equals(str)) {
            return k.e0.c.Square;
        }
        return null;
    }

    public static k.e0.d E0(String str) {
        if ("miter".equals(str)) {
            return k.e0.d.Miter;
        }
        if ("round".equals(str)) {
            return k.e0.d.Round;
        }
        if ("bevel".equals(str)) {
            return k.e0.d.Bevel;
        }
        return null;
    }

    public static void F0(k.l0 l0Var, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strS = iVar.s(':');
            iVar.A();
            if (!iVar.f(':')) {
                return;
            }
            iVar.A();
            String strU = iVar.u(';');
            if (strU == null) {
                return;
            }
            iVar.A();
            if (iVar.h() || iVar.f(';')) {
                if (l0Var.f130043f == null) {
                    l0Var.f130043f = new k.e0();
                }
                T0(l0Var.f130043f, strS, strU);
                iVar.A();
            }
        }
    }

    public static Set<String> G0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            int iIndexOf = strR.indexOf(45);
            if (iIndexOf != -1) {
                strR = strR.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strR, "", "").getLanguage());
            iVar.A();
        }
        return hashSet;
    }

    public static k.e0.f H0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return k.e0.f.Middle;
            case "end":
                return k.e0.f.End;
            case "start":
                return k.e0.f.Start;
            default:
                return null;
        }
    }

    public static k.e0.g I0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return k.e0.g.LineThrough;
            case "underline":
                return k.e0.g.Underline;
            case "none":
                return k.e0.g.None;
            case "blink":
                return k.e0.g.Blink;
            case "overline":
                return k.e0.g.Overline;
            default:
                return null;
        }
    }

    public static k.e0.h J0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return k.e0.h.LTR;
        }
        if (str.equals("rtl")) {
            return k.e0.h.RTL;
        }
        return null;
    }

    public static k.e0.i N0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return k.e0.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return k.e0.i.NonScalingStroke;
        }
        return null;
    }

    public static k.b O0(String str) throws o {
        i iVar = new i(str);
        iVar.A();
        float fN = iVar.n();
        iVar.z();
        float fN2 = iVar.n();
        iVar.z();
        float fN3 = iVar.n();
        iVar.z();
        float fN4 = iVar.n();
        if (Float.isNaN(fN) || Float.isNaN(fN2) || Float.isNaN(fN3) || Float.isNaN(fN4)) {
            throw new o("Invalid viewBox definition - should have four numbers");
        }
        if (fN3 < 0.0f) {
            throw new o("Invalid viewBox. width cannot be negative");
        }
        if (fN4 >= 0.0f) {
            return new k.b(fN, fN2, fN3, fN4);
        }
        throw new o("Invalid viewBox. height cannot be negative");
    }

    public static void T0(k.e0 e0Var, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f130208b[g.a(str).ordinal()]) {
                case 47:
                    k.o0 o0VarU0 = u0(str2);
                    e0Var.f129940c = o0VarU0;
                    if (o0VarU0 != null) {
                        e0Var.f129939b |= 1;
                    }
                    break;
                case 48:
                    k.e0.a aVarF0 = f0(str2);
                    e0Var.f129941d = aVarF0;
                    if (aVarF0 != null) {
                        e0Var.f129939b |= 2;
                    }
                    break;
                case 49:
                    Float fS0 = s0(str2);
                    e0Var.f129942e = fS0;
                    if (fS0 != null) {
                        e0Var.f129939b |= 4;
                    }
                    break;
                case 50:
                    k.o0 o0VarU1 = u0(str2);
                    e0Var.f129943f = o0VarU1;
                    if (o0VarU1 != null) {
                        e0Var.f129939b |= 8;
                    }
                    break;
                case 51:
                    Float fS1 = s0(str2);
                    e0Var.f129944g = fS1;
                    if (fS1 != null) {
                        e0Var.f129939b |= 16;
                    }
                    break;
                case 52:
                    e0Var.f129945h = p0(str2);
                    e0Var.f129939b |= 32;
                    break;
                case 53:
                    k.e0.c cVarD0 = D0(str2);
                    e0Var.f129946i = cVarD0;
                    if (cVarD0 != null) {
                        e0Var.f129939b |= 64;
                    }
                    break;
                case 54:
                    k.e0.d dVarE0 = E0(str2);
                    e0Var.f129947j = dVarE0;
                    if (dVarE0 != null) {
                        e0Var.f129939b |= 128;
                    }
                    break;
                case 55:
                    e0Var.f129948k = Float.valueOf(g0(str2));
                    e0Var.f129939b |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        k.p[] pVarArrC0 = C0(str2);
                        e0Var.f129949l = pVarArrC0;
                        if (pVarArrC0 != null) {
                            e0Var.f129939b |= 512;
                        }
                    } else {
                        e0Var.f129949l = null;
                        e0Var.f129939b |= 512;
                    }
                    break;
                case 57:
                    e0Var.f129950m = p0(str2);
                    e0Var.f129939b |= 1024;
                    break;
                case 58:
                    e0Var.f129951n = s0(str2);
                    e0Var.f129939b |= 2048;
                    break;
                case 59:
                    e0Var.f129952o = c0(str2);
                    e0Var.f129939b |= 4096;
                    break;
                case 60:
                    i0(e0Var, str2);
                    break;
                case 61:
                    List<String> listJ0 = j0(str2);
                    e0Var.f129953p = listJ0;
                    if (listJ0 != null) {
                        e0Var.f129939b |= 8192;
                    }
                    break;
                case 62:
                    k.p pVarK0 = k0(str2);
                    e0Var.f129954q = pVarK0;
                    if (pVarK0 != null) {
                        e0Var.f129939b |= 16384;
                    }
                    break;
                case 63:
                    Integer numM0 = m0(str2);
                    e0Var.f129955r = numM0;
                    if (numM0 != null) {
                        e0Var.f129939b |= 32768;
                    }
                    break;
                case 64:
                    k.e0.b bVarL0 = l0(str2);
                    e0Var.f129956s = bVarL0;
                    if (bVarL0 != null) {
                        e0Var.f129939b |= 65536;
                    }
                    break;
                case 65:
                    k.e0.g gVarI0 = I0(str2);
                    e0Var.f129957t = gVarI0;
                    if (gVarI0 != null) {
                        e0Var.f129939b |= 131072;
                    }
                    break;
                case 66:
                    k.e0.h hVarJ0 = J0(str2);
                    e0Var.f129958u = hVarJ0;
                    if (hVarJ0 != null) {
                        e0Var.f129939b |= k.W;
                    }
                    break;
                case 67:
                    k.e0.f fVarH0 = H0(str2);
                    e0Var.f129959v = fVarH0;
                    if (fVarH0 != null) {
                        e0Var.f129939b |= 262144;
                    }
                    break;
                case 68:
                    Boolean boolT0 = t0(str2);
                    e0Var.f129960w = boolT0;
                    if (boolT0 != null) {
                        e0Var.f129939b |= 524288;
                    }
                    break;
                case 69:
                    String strN0 = n0(str2, str);
                    e0Var.f129962y = strN0;
                    e0Var.f129963z = strN0;
                    e0Var.A = strN0;
                    e0Var.f129939b |= 14680064;
                    break;
                case 70:
                    e0Var.f129962y = n0(str2, str);
                    e0Var.f129939b |= 2097152;
                    break;
                case 71:
                    e0Var.f129963z = n0(str2, str);
                    e0Var.f129939b |= 4194304;
                    break;
                case 72:
                    e0Var.A = n0(str2, str);
                    e0Var.f129939b |= k.J;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if (f130196x.contains('|' + str2 + '|')) {
                            e0Var.B = Boolean.valueOf(!str2.equals("none"));
                            e0Var.f129939b |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if (f130197y.contains('|' + str2 + '|')) {
                            e0Var.C = Boolean.valueOf(str2.equals("visible"));
                            e0Var.f129939b |= k.L;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals(f130195w)) {
                        e0Var.D = k.g.a();
                    } else {
                        try {
                            e0Var.D = c0(str2);
                        } catch (o e10) {
                            Log.w(f130182j, e10.getMessage());
                            return;
                        }
                    }
                    e0Var.f129939b |= k.M;
                    break;
                case 76:
                    e0Var.E = s0(str2);
                    e0Var.f129939b |= k.N;
                    break;
                case 77:
                    k.c cVarB0 = b0(str2);
                    e0Var.f129961x = cVarB0;
                    if (cVarB0 != null) {
                        e0Var.f129939b |= 1048576;
                    }
                    break;
                case 78:
                    e0Var.F = n0(str2, str);
                    e0Var.f129939b |= k.O;
                    break;
                case 79:
                    e0Var.G = f0(str2);
                    e0Var.f129939b |= k.P;
                    break;
                case 80:
                    e0Var.H = n0(str2, str);
                    e0Var.f129939b |= k.Q;
                    break;
                case 81:
                    if (str2.equals(f130195w)) {
                        e0Var.I = k.g.a();
                    } else {
                        try {
                            e0Var.I = c0(str2);
                        } catch (o e11) {
                            Log.w(f130182j, e11.getMessage());
                            return;
                        }
                    }
                    e0Var.f129939b |= k.R;
                    break;
                case 82:
                    e0Var.J = s0(str2);
                    e0Var.f129939b |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals(f130195w)) {
                        e0Var.K = k.g.a();
                    } else {
                        try {
                            e0Var.K = c0(str2);
                        } catch (o e12) {
                            Log.w(f130182j, e12.getMessage());
                            return;
                        }
                    }
                    e0Var.f129939b |= 8589934592L;
                    break;
                case 84:
                    e0Var.L = s0(str2);
                    e0Var.f129939b |= k.U;
                    break;
                case 85:
                    k.e0.i iVarN0 = N0(str2);
                    e0Var.M = iVarN0;
                    if (iVarN0 != null) {
                        e0Var.f129939b |= k.V;
                    }
                    break;
                case 86:
                    k.e0.e eVarZ0 = z0(str2);
                    e0Var.N = eVarZ0;
                    if (eVarZ0 != null) {
                        e0Var.f129939b |= k.X;
                    }
                    break;
            }
        } catch (o unused) {
        }
    }

    public static k.c b0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.A();
        k.p pVarR0 = r0(iVar);
        iVar.z();
        k.p pVarR1 = r0(iVar);
        iVar.z();
        k.p pVarR2 = r0(iVar);
        iVar.z();
        k.p pVarR3 = r0(iVar);
        iVar.A();
        if (iVar.f(')') || iVar.h()) {
            return new k.c(pVarR0, pVarR1, pVarR2, pVarR3);
        }
        return null;
    }

    public static k.f c0(String str) throws o {
        if (str.charAt(0) == '#') {
            sc.e eVarB = sc.e.b(str, 1, str.length());
            if (eVarB == null) {
                throw new o("Bad hex colour value: " + str);
            }
            int iA = eVarB.a();
            if (iA == 4) {
                int iD = eVarB.d();
                int i10 = iD & 3840;
                int i11 = iD & 240;
                int i12 = iD & 15;
                return new k.f(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (iA == 5) {
                int iD2 = eVarB.d();
                int i13 = 61440 & iD2;
                int i14 = iD2 & 3840;
                int i15 = iD2 & 240;
                int i16 = iD2 & 15;
                return new k.f((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
            }
            if (iA == 7) {
                return new k.f(eVarB.d() | (-16777216));
            }
            if (iA == 9) {
                return new k.f((eVarB.d() >>> 8) | (eVarB.d() << 24));
            }
            throw new o("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return d0(lowerCase);
            }
            i iVar = new i(str.substring(zStartsWith2 ? 5 : 4));
            iVar.A();
            float fN = iVar.n();
            float fD = iVar.d(fN);
            if (!Float.isNaN(fD)) {
                iVar.f('%');
            }
            float fD2 = iVar.d(fD);
            if (!Float.isNaN(fD2)) {
                iVar.f('%');
            }
            if (!zStartsWith2) {
                iVar.A();
                if (!Float.isNaN(fD2) && iVar.f(')')) {
                    return new k.f(t(fN, fD, fD2) | (-16777216));
                }
                throw new o("Bad hsl() colour value: " + str);
            }
            float fD3 = iVar.d(fD2);
            iVar.A();
            if (!Float.isNaN(fD3) && iVar.f(')')) {
                return new k.f((j(fD3 * 256.0f) << 24) | t(fN, fD, fD2));
            }
            throw new o("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(zStartsWith ? 5 : 4));
        iVar2.A();
        float fN2 = iVar2.n();
        if (!Float.isNaN(fN2) && iVar2.f('%')) {
            fN2 = (fN2 * 256.0f) / 100.0f;
        }
        float fD4 = iVar2.d(fN2);
        if (!Float.isNaN(fD4) && iVar2.f('%')) {
            fD4 = (fD4 * 256.0f) / 100.0f;
        }
        float fD5 = iVar2.d(fD4);
        if (!Float.isNaN(fD5) && iVar2.f('%')) {
            fD5 = (fD5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            iVar2.A();
            if (!Float.isNaN(fD5) && iVar2.f(')')) {
                return new k.f((j(fN2) << 16) | (-16777216) | (j(fD4) << 8) | j(fD5));
            }
            throw new o("Bad rgb() colour value: " + str);
        }
        float fD6 = iVar2.d(fD5);
        iVar2.A();
        if (!Float.isNaN(fD6) && iVar2.f(')')) {
            return new k.f((j(fD6 * 256.0f) << 24) | (j(fN2) << 16) | (j(fD4) << 8) | j(fD5));
        }
        throw new o("Bad rgba() colour value: " + str);
    }

    public static k.f d0(String str) throws o {
        Integer numA = c.a(str);
        if (numA != null) {
            return new k.f(numA.intValue());
        }
        throw new o("Invalid colour keyword: " + str);
    }

    public static k.o0 e0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return k.f.f130005d;
        }
        if (str.equals(f130195w)) {
            return k.g.a();
        }
        try {
            return c0(str);
        } catch (o unused) {
            return null;
        }
    }

    public static k.e0.a f0(String str) {
        if ("nonzero".equals(str)) {
            return k.e0.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return k.e0.a.EvenOdd;
        }
        return null;
    }

    public static float g0(String str) throws o {
        int length = str.length();
        if (length != 0) {
            return h0(str, 0, length);
        }
        throw new o("Invalid float value (empty string)");
    }

    public static float h0(String str, int i10, int i11) throws o {
        float fB = new sc.g().b(str, i10, i11);
        if (!Float.isNaN(fB)) {
            return fB;
        }
        throw new o("Invalid float value: " + str);
    }

    public static void i0(k.e0 e0Var, String str) {
        String strS;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer numA = null;
            k.e0.b bVarL0 = null;
            String str2 = null;
            while (true) {
                strS = iVar.s('/');
                iVar.A();
                if (strS != null) {
                    if (numA != null && bVarL0 != null) {
                        break;
                    }
                    if (!strS.equals("normal") && (numA != null || (numA = e.a(strS)) == null)) {
                        if (bVarL0 != null || (bVarL0 = l0(strS)) == null) {
                            if (str2 != null || !strS.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strS;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            k.p pVarK0 = k0(strS);
            if (iVar.f('/')) {
                iVar.A();
                String strR = iVar.r();
                if (strR != null) {
                    try {
                        p0(strR);
                    } catch (o unused) {
                        return;
                    }
                }
                iVar.A();
            }
            e0Var.f129953p = j0(iVar.y());
            e0Var.f129954q = pVarK0;
            e0Var.f129955r = Integer.valueOf(numA == null ? 400 : numA.intValue());
            if (bVarL0 == null) {
                bVarL0 = k.e0.b.Normal;
            }
            e0Var.f129956s = bVarL0;
            e0Var.f129939b |= 122880;
        }
    }

    public static int j(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    public static List<String> j0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String strQ = iVar.q();
            if (strQ == null) {
                strQ = iVar.u(fw.b.f85380g);
            }
            if (strQ == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strQ);
            iVar.z();
        } while (!iVar.h());
        return arrayList;
    }

    public static k.p k0(String str) {
        try {
            k.p pVarA = d.a(str);
            return pVarA == null ? p0(str) : pVarA;
        } catch (o unused) {
            return null;
        }
    }

    public static k.e0.b l0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return k.e0.b.Oblique;
            case "italic":
                return k.e0.b.Italic;
            case "normal":
                return k.e0.b.Normal;
            default:
                return null;
        }
    }

    public static Integer m0(String str) {
        return e.a(str);
    }

    public static String n0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(gi.j.f86771d) ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static k.p p0(String str) throws o {
        if (str.length() == 0) {
            throw new o("Invalid length value (empty string)");
        }
        int length = str.length();
        k.d1 d1VarValueOf = k.d1.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            d1VarValueOf = k.d1.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d1VarValueOf = k.d1.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new o("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new k.p(h0(str, 0, length), d1VarValueOf);
        } catch (NumberFormatException e10) {
            throw new o("Invalid length value: " + str, e10);
        }
    }

    public static List<k.p> q0(String str) throws o {
        if (str.length() == 0) {
            throw new o("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            float fN = iVar.n();
            if (Float.isNaN(fN)) {
                throw new o("Invalid length list value: " + iVar.b());
            }
            k.d1 d1VarV = iVar.v();
            if (d1VarV == null) {
                d1VarV = k.d1.px;
            }
            arrayList.add(new k.p(fN, d1VarV));
            iVar.z();
        }
        return arrayList;
    }

    public static k.p r0(i iVar) {
        return iVar.g("auto") ? new k.p(0.0f) : iVar.p();
    }

    public static Float s0(String str) {
        try {
            float fG0 = g0(str);
            float f10 = 0.0f;
            if (fG0 < 0.0f) {
                fG0 = f10;
            } else {
                f10 = 1.0f;
                if (fG0 > 1.0f) {
                    fG0 = f10;
                }
            }
            return Float.valueOf(fG0);
        } catch (o unused) {
            return null;
        }
    }

    public static int t(float f10, float f11, float f12) {
        float f13 = 0.0f;
        float f14 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f14 += 360.0f;
        }
        float f15 = f14 / 60.0f;
        float f16 = f11 / 100.0f;
        float f17 = f12 / 100.0f;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        } else if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        if (f17 >= 0.0f) {
            f13 = f17 > 1.0f ? 1.0f : f17;
        }
        float f18 = f13 <= 0.5f ? (f16 + 1.0f) * f13 : (f13 + f16) - (f16 * f13);
        float f19 = (f13 * 2.0f) - f18;
        return j(u(f19, f18, f15 - 2.0f) * 256.0f) | (j(u(f19, f18, f15 + 2.0f) * 256.0f) << 16) | (j(u(f19, f18, f15) * 256.0f) << 8);
    }

    public static Boolean t0(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    public static float u(float f10, float f11, float f12) {
        float f13;
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        if (f12 < 1.0f) {
            f13 = (f11 - f10) * f12;
        } else {
            if (f12 < 3.0f) {
                return f11;
            }
            if (f12 >= 4.0f) {
                return f10;
            }
            f13 = (f11 - f10) * (4.0f - f12);
        }
        return f13 + f10;
    }

    public static k.o0 u0(String str) {
        if (!str.startsWith("url(")) {
            return e0(str);
        }
        int iIndexOf = str.indexOf(gi.j.f86771d);
        if (iIndexOf == -1) {
            return new k.u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new k.u(strTrim, strTrim2.length() > 0 ? e0(strTrim2) : null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x0287  */
    /* JADX WARN: Code duplicated, block: B:118:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x028f A[SYNTHETIC] */
    public static k.w v0(String str) {
        float f10;
        float f11;
        float f12;
        i iVar = new i(str);
        k.w wVar = new k.w();
        if (!iVar.h()) {
            int iIntValue = iVar.l().intValue();
            int i10 = 109;
            if (iIntValue == 77 || iIntValue == 109) {
                int iIntValue2 = iIntValue;
                float f13 = 0.0f;
                float fN = 0.0f;
                float f14 = 0.0f;
                float fD = 0.0f;
                float f15 = 0.0f;
                float f16 = 0.0f;
                while (true) {
                    iVar.A();
                    switch (iIntValue2) {
                        case 65:
                        case androidx.constraintlayout.widget.g.R1 /* 97 */:
                            float f17 = f13;
                            float fN2 = iVar.n();
                            float fD2 = iVar.d(fN2);
                            float f18 = f14;
                            float fD3 = iVar.d(fD2);
                            Boolean boolC = iVar.c(Float.valueOf(fD3));
                            Boolean boolC2 = iVar.c(boolC);
                            float fE = iVar.e(boolC2);
                            float fD4 = iVar.d(fE);
                            if (!Float.isNaN(fD4) && fN2 >= 0.0f && fD2 >= 0.0f) {
                                if (iIntValue2 == 97) {
                                    fE += f17;
                                    fD4 += f18;
                                }
                                float f19 = fD4;
                                boolean zBooleanValue = boolC.booleanValue();
                                boolean zBooleanValue2 = boolC2.booleanValue();
                                float f20 = fE;
                                wVar.e(fN2, fD2, fD3, zBooleanValue, zBooleanValue2, f20, f19);
                                f13 = f20;
                                fN = f13;
                                f14 = f19;
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e(f130182j, "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 67:
                        case 99:
                            float fN3 = iVar.n();
                            float fD5 = iVar.d(fN3);
                            float fD6 = iVar.d(fD5);
                            float fD7 = iVar.d(fD6);
                            float fD8 = iVar.d(fD7);
                            float fD9 = iVar.d(fD8);
                            if (!Float.isNaN(fD9)) {
                                if (iIntValue2 == 99) {
                                    fD8 += f13;
                                    fD9 += f14;
                                    fN3 += f13;
                                    fD5 += f14;
                                    fD6 += f13;
                                    fD7 += f14;
                                }
                                float f21 = fN3;
                                float f22 = fD5;
                                f10 = fD6;
                                fD = fD7;
                                f11 = fD8;
                                f12 = fD9;
                                wVar.d(f21, f22, f10, fD, f11, f12);
                                fN = f10;
                                f13 = f11;
                                f14 = f12;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e(f130182j, "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 72:
                        case 104:
                            float fN4 = iVar.n();
                            if (!Float.isNaN(fN4)) {
                                if (iIntValue2 == 104) {
                                    fN4 += f13;
                                }
                                f13 = fN4;
                                wVar.b(f13, f14);
                                fN = f13;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e(f130182j, "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 76:
                        case 108:
                            float fN5 = iVar.n();
                            float fD10 = iVar.d(fN5);
                            if (!Float.isNaN(fD10)) {
                                if (iIntValue2 == 108) {
                                    fN5 += f13;
                                    fD10 += f14;
                                }
                                f13 = fN5;
                                f14 = fD10;
                                wVar.b(f13, f14);
                                fN = f13;
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e(f130182j, "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 77:
                        case 109:
                            float fN6 = iVar.n();
                            float fD11 = iVar.d(fN6);
                            if (!Float.isNaN(fD11)) {
                                if (iIntValue2 == i10 && !wVar.i()) {
                                    fN6 += f13;
                                    fD11 += f14;
                                }
                                f13 = fN6;
                                f14 = fD11;
                                wVar.a(f13, f14);
                                fN = f13;
                                f15 = fN;
                                fD = f14;
                                f16 = fD;
                                iIntValue2 = iIntValue2 != i10 ? 76 : 108;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e(f130182j, "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 81:
                        case 113:
                            fN = iVar.n();
                            fD = iVar.d(fN);
                            float fD12 = iVar.d(fD);
                            float fD13 = iVar.d(fD12);
                            if (!Float.isNaN(fD13)) {
                                if (iIntValue2 == 113) {
                                    fD12 += f13;
                                    fD13 += f14;
                                    fN += f13;
                                    fD += f14;
                                }
                                f13 = fD12;
                                f14 = fD13;
                                wVar.c(fN, fD, f13, f14);
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e(f130182j, "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 83:
                        case 115:
                            float f23 = (f13 * 2.0f) - fN;
                            float f24 = (2.0f * f14) - fD;
                            float fN7 = iVar.n();
                            float fD14 = iVar.d(fN7);
                            float fD15 = iVar.d(fD14);
                            float fD16 = iVar.d(fD15);
                            if (!Float.isNaN(fD16)) {
                                if (iIntValue2 == 115) {
                                    fD15 += f13;
                                    fD16 += f14;
                                    fN7 += f13;
                                    fD14 += f14;
                                }
                                f10 = fN7;
                                fD = fD14;
                                f11 = fD15;
                                f12 = fD16;
                                wVar.d(f23, f24, f10, fD, f11, f12);
                                fN = f10;
                                f13 = f11;
                                f14 = f12;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e(f130182j, "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 84:
                        case 116:
                            fN = (f13 * 2.0f) - fN;
                            fD = (2.0f * f14) - fD;
                            float fN8 = iVar.n();
                            float fD17 = iVar.d(fN8);
                            if (!Float.isNaN(fD17)) {
                                if (iIntValue2 == 116) {
                                    fN8 += f13;
                                    fD17 += f14;
                                }
                                f13 = fN8;
                                f14 = fD17;
                                wVar.c(fN, fD, f13, f14);
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e(f130182j, "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 86:
                        case 118:
                            float fN9 = iVar.n();
                            if (!Float.isNaN(fN9)) {
                                if (iIntValue2 == 118) {
                                    fN9 += f14;
                                }
                                f14 = fN9;
                                wVar.b(f13, f14);
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e(f130182j, "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 90:
                        case 122:
                            wVar.close();
                            f13 = f15;
                            fN = f13;
                            f14 = f16;
                            fD = f14;
                            iVar.z();
                            if (iVar.h()) {
                                if (iVar.i()) {
                                    iIntValue2 = iVar.l().intValue();
                                }
                                i10 = 109;
                            }
                            break;
                        default:
                            break;
                    }
                    return wVar;
                }
            }
        }
        return wVar;
    }

    public static sc.h w0(String str) throws o {
        sc.h.b bVar;
        i iVar = new i(str);
        iVar.A();
        String strR = iVar.r();
        if ("defer".equals(strR)) {
            iVar.A();
            strR = iVar.r();
        }
        sc.h.a aVarA = b.a(strR);
        iVar.A();
        if (iVar.h()) {
            bVar = null;
        } else {
            String strR2 = iVar.r();
            strR2.getClass();
            if (strR2.equals("meet")) {
                bVar = sc.h.b.meet;
            } else {
                if (!strR2.equals("slice")) {
                    throw new o("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = sc.h.b.slice;
            }
        }
        return new sc.h(aVarA, bVar);
    }

    public static void x0(k.p0 p0Var, String str) throws o {
        p0Var.f130060o = w0(str);
    }

    public static k.e0.e z0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return k.e0.e.optimizeQuality;
            case "auto":
                return k.e0.e.auto;
            case "optimizeSpeed":
                return k.e0.e.optimizeSpeed;
            default:
                return null;
        }
    }

    public k A(InputStream inputStream, boolean z10) throws o {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i10 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i10 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            M0(inputStream, z10);
            return this.f130198a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e(f130182j, "Exception thrown closing input stream");
            }
        }
    }

    public final void B(k.d dVar, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 12:
                    dVar.f129924o = p0(strTrim);
                    break;
                case 13:
                    dVar.f129925p = p0(strTrim);
                    break;
                case 14:
                    k.p pVarP0 = p0(strTrim);
                    dVar.f129926q = pVarP0;
                    if (pVarP0.g()) {
                        throw new o("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    public final void C(k.e eVar, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    eVar.f129938p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new o("Invalid value for attribute clipPathUnits");
                    }
                    eVar.f129938p = Boolean.TRUE;
                }
            }
        }
    }

    public final void D(k.g0 g0Var, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 21:
                    g0Var.i(A0(strTrim));
                    break;
                case 22:
                    g0Var.k(strTrim);
                    break;
                case 23:
                    g0Var.e(G0(strTrim));
                    break;
                case 24:
                    g0Var.j(B0(strTrim));
                    break;
                case 25:
                    List<String> listJ0 = j0(strTrim);
                    g0Var.b(listJ0 != null ? new HashSet(listJ0) : new HashSet(0));
                    break;
            }
        }
    }

    public final void E(k.l0 l0Var, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l0Var.f130040c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if ("default".equals(strTrim)) {
                    l0Var.f130041d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        l0Var.f130041d = Boolean.TRUE;
                        return;
                    }
                    throw new o("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    public final void F(k.i iVar, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 10:
                    k.p pVarP0 = p0(strTrim);
                    iVar.f130022q = pVarP0;
                    if (pVarP0.g()) {
                        throw new o("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    k.p pVarP1 = p0(strTrim);
                    iVar.f130023r = pVarP1;
                    if (pVarP1.g()) {
                        throw new o("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    iVar.f130020o = p0(strTrim);
                    break;
                case 13:
                    iVar.f130021p = p0(strTrim);
                    break;
            }
        }
    }

    public final void G(k.j jVar, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                switch (i11) {
                    case 32:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new o("Invalid value for attribute gradientUnits");
                            }
                            jVar.f130030i = Boolean.TRUE;
                        } else {
                            jVar.f130030i = Boolean.FALSE;
                        }
                        break;
                    case 33:
                        jVar.f130031j = K0(strTrim);
                        break;
                    case 34:
                        try {
                            jVar.f130032k = k.EnumC1284k.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new o("Invalid spreadMethod attribute. \"" + strTrim + "\" is not a valid value.");
                        }
                        break;
                }
            } else if ("".equals(attributes.getURI(i10)) || f130184l.equals(attributes.getURI(i10))) {
                jVar.f130033l = strTrim;
            }
        }
    }

    public final void H(k.o oVar, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                oVar.f130053q = p0(strTrim);
            } else if (i11 == 2) {
                oVar.f130054r = p0(strTrim);
            } else if (i11 == 3) {
                k.p pVarP0 = p0(strTrim);
                oVar.f130055s = pVarP0;
                if (pVarP0.g()) {
                    throw new o("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                k.p pVarP1 = p0(strTrim);
                oVar.f130056t = pVarP1;
                if (pVarP1.g()) {
                    throw new o("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                if (i11 == 7) {
                    x0(oVar, strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || f130184l.equals(attributes.getURI(i10))) {
                oVar.f130052p = strTrim;
            }
        }
    }

    public final void I(k.q qVar, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    qVar.f130061o = p0(strTrim);
                    break;
                case 16:
                    qVar.f130062p = p0(strTrim);
                    break;
                case 17:
                    qVar.f130063q = p0(strTrim);
                    break;
                case 18:
                    qVar.f130064r = p0(strTrim);
                    break;
            }
        }
    }

    public final void J(k.m0 m0Var, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    m0Var.f130046m = p0(strTrim);
                    break;
                case 16:
                    m0Var.f130047n = p0(strTrim);
                    break;
                case 17:
                    m0Var.f130048o = p0(strTrim);
                    break;
                case 18:
                    m0Var.f130049p = p0(strTrim);
                    break;
            }
        }
    }

    public final void K(k.r rVar, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 26:
                    rVar.f130071r = p0(strTrim);
                    break;
                case 27:
                    rVar.f130072s = p0(strTrim);
                    break;
                case 28:
                    k.p pVarP0 = p0(strTrim);
                    rVar.f130073t = pVarP0;
                    if (pVarP0.g()) {
                        throw new o("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    k.p pVarP1 = p0(strTrim);
                    rVar.f130074u = pVarP1;
                    if (pVarP1.g()) {
                        throw new o("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new o("Invalid value for attribute markerUnits");
                        }
                        rVar.f130070q = true;
                    } else {
                        rVar.f130070q = false;
                    }
                    break;
                case 31:
                    if ("auto".equals(strTrim)) {
                        rVar.f130075v = Float.valueOf(Float.NaN);
                    } else {
                        rVar.f130075v = Float.valueOf(g0(strTrim));
                    }
                    break;
            }
        }
    }

    public final Matrix K0(String str) throws o {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            String strO = iVar.o();
            if (strO == null) {
                throw new o("Bad transform function encountered in transform list: " + str);
            }
            switch (strO) {
                case "matrix":
                    iVar.A();
                    float fN = iVar.n();
                    iVar.z();
                    float fN2 = iVar.n();
                    iVar.z();
                    float fN3 = iVar.n();
                    iVar.z();
                    float fN4 = iVar.n();
                    iVar.z();
                    float fN5 = iVar.n();
                    iVar.z();
                    float fN6 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN6) || !iVar.f(')')) {
                        throw new o("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fN, fN3, fN5, fN2, fN4, fN6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    iVar.A();
                    float fN7 = iVar.n();
                    float fX = iVar.x();
                    float fX2 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN7) || !iVar.f(')')) {
                        throw new o("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fX)) {
                        matrix.preRotate(fN7);
                    } else {
                        if (Float.isNaN(fX2)) {
                            throw new o("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fN7, fX, fX2);
                    }
                    break;
                    break;
                case "scale":
                    iVar.A();
                    float fN8 = iVar.n();
                    float fX3 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN8) || !iVar.f(')')) {
                        throw new o("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX3)) {
                        matrix.preScale(fN8, fX3);
                    } else {
                        matrix.preScale(fN8, fN8);
                    }
                    break;
                    break;
                case "skewX":
                    iVar.A();
                    float fN9 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN9) || !iVar.f(')')) {
                        throw new o("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fN9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    iVar.A();
                    float fN10 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN10) || !iVar.f(')')) {
                        throw new o("Invalid transform list: " + str);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fN10)));
                    break;
                    break;
                case "translate":
                    iVar.A();
                    float fN11 = iVar.n();
                    float fX4 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN11) || !iVar.f(')')) {
                        throw new o("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX4)) {
                        matrix.preTranslate(fN11, fX4);
                    } else {
                        matrix.preTranslate(fN11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new o("Invalid transform list fn: " + strO + gi.j.f86771d);
            }
            if (iVar.h()) {
                return matrix;
            }
            iVar.z();
        }
        return matrix;
    }

    public final void L(k.s sVar, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                sVar.f130079q = p0(strTrim);
            } else if (i11 == 2) {
                sVar.f130080r = p0(strTrim);
            } else if (i11 == 3) {
                k.p pVarP0 = p0(strTrim);
                sVar.f130081s = pVarP0;
                if (pVarP0.g()) {
                    throw new o("Invalid <mask> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                k.p pVarP1 = p0(strTrim);
                sVar.f130082t = pVarP1;
                if (pVarP1.g()) {
                    throw new o("Invalid <mask> element. height cannot be negative");
                }
            } else if (i11 != 43) {
                if (i11 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    sVar.f130078p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new o("Invalid value for attribute maskContentUnits");
                    }
                    sVar.f130078p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                sVar.f130077o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new o("Invalid value for attribute maskUnits");
                }
                sVar.f130077o = Boolean.TRUE;
            }
        }
    }

    public final void L0(InputStream inputStream) throws o {
        Log.d(f130182j, "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new o("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new o("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new o("SVG parse error", e12);
        }
    }

    public final void M(k.v vVar, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 8) {
                vVar.f130087o = v0(strTrim);
            } else if (i11 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(g0(strTrim));
                vVar.f130088p = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new o("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    public final void M0(InputStream inputStream, boolean z10) throws o {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        X0();
                    } else if (eventType == 8) {
                        Log.d(f130182j, "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        i iVar = new i(xmlPullParserNewPullParser.getText());
                        s(iVar.r(), y0(iVar));
                    } else if (eventType == 10) {
                        if (z10 && this.f130198a.z() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d(f130182j, "Switching to SAX parser to process entities");
                                inputStream.reset();
                                L0(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w(f130182j, "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        Y0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        q(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        f1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        d1(xmlPullParserNewPullParser.getText());
                    }
                }
                p();
            } catch (IOException e10) {
                throw new o("Stream error", e10);
            }
        } catch (XmlPullParserException e11) {
            throw new o("XML parser problem", e11);
        }
    }

    public final void N(k.y yVar, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                yVar.f130104t = p0(strTrim);
            } else if (i11 == 2) {
                yVar.f130105u = p0(strTrim);
            } else if (i11 == 3) {
                k.p pVarP0 = p0(strTrim);
                yVar.f130106v = pVarP0;
                if (pVarP0.g()) {
                    throw new o("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                k.p pVarP1 = p0(strTrim);
                yVar.f130107w = pVarP1;
                if (pVarP1.g()) {
                    throw new o("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                switch (i11) {
                    case 40:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new o("Invalid value for attribute patternUnits");
                            }
                            yVar.f130101q = Boolean.TRUE;
                        } else {
                            yVar.f130101q = Boolean.FALSE;
                        }
                        break;
                    case 41:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new o("Invalid value for attribute patternContentUnits");
                            }
                            yVar.f130102r = Boolean.TRUE;
                        } else {
                            yVar.f130102r = Boolean.FALSE;
                        }
                        break;
                    case 42:
                        yVar.f130103s = K0(strTrim);
                        break;
                }
            } else if ("".equals(attributes.getURI(i10)) || f130184l.equals(attributes.getURI(i10))) {
                yVar.f130108x = strTrim;
            }
        }
    }

    public final void O(k.z zVar, Attributes attributes, String str) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.a(attributes.getLocalName(i10)) == g.points) {
                i iVar = new i(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                iVar.A();
                while (!iVar.h()) {
                    float fN = iVar.n();
                    if (Float.isNaN(fN)) {
                        throw new o("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.z();
                    float fN2 = iVar.n();
                    if (Float.isNaN(fN2)) {
                        throw new o("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.z();
                    arrayList.add(Float.valueOf(fN));
                    arrayList.add(Float.valueOf(fN2));
                }
                zVar.f130109o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    zVar.f130109o[i11] = ((Float) it.next()).floatValue();
                    i11++;
                }
            }
        }
    }

    public final void P(k.q0 q0Var, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 35) {
                q0Var.f130068p = p0(strTrim);
            } else if (i11 != 36) {
                switch (i11) {
                    case 12:
                        q0Var.f130065m = p0(strTrim);
                        break;
                    case 13:
                        q0Var.f130066n = p0(strTrim);
                        break;
                    case 14:
                        k.p pVarP0 = p0(strTrim);
                        q0Var.f130067o = pVarP0;
                        if (pVarP0.g()) {
                            throw new o("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                        break;
                }
            } else {
                q0Var.f130069q = p0(strTrim);
            }
        }
    }

    public final void P0(Attributes attributes) throws o {
        l("<path>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.v vVar = new k.v();
        vVar.f130050a = this.f130198a;
        vVar.f130051b = this.f130199b;
        E(vVar, attributes);
        T(vVar, attributes);
        X(vVar, attributes);
        D(vVar, attributes);
        M(vVar, attributes);
        this.f130199b.d(vVar);
    }

    public final void Q(k.b0 b0Var, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                b0Var.f129912o = p0(strTrim);
            } else if (i11 == 2) {
                b0Var.f129913p = p0(strTrim);
            } else if (i11 == 3) {
                k.p pVarP0 = p0(strTrim);
                b0Var.f129914q = pVarP0;
                if (pVarP0.g()) {
                    throw new o("Invalid <rect> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                k.p pVarP1 = p0(strTrim);
                b0Var.f129915r = pVarP1;
                if (pVarP1.g()) {
                    throw new o("Invalid <rect> element. height cannot be negative");
                }
            } else if (i11 == 10) {
                k.p pVarP2 = p0(strTrim);
                b0Var.f129916s = pVarP2;
                if (pVarP2.g()) {
                    throw new o("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i11 != 11) {
                continue;
            } else {
                k.p pVarP3 = p0(strTrim);
                b0Var.f129917t = pVarP3;
                if (pVarP3.g()) {
                    throw new o("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    public final void Q0(Attributes attributes) throws o {
        l("<pattern>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.y yVar = new k.y();
        yVar.f130050a = this.f130198a;
        yVar.f130051b = this.f130199b;
        E(yVar, attributes);
        T(yVar, attributes);
        D(yVar, attributes);
        Z(yVar, attributes);
        N(yVar, attributes);
        this.f130199b.d(yVar);
        this.f130199b = yVar;
    }

    public final void R(k.f0 f0Var, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                f0Var.f130007q = p0(strTrim);
            } else if (i11 == 2) {
                f0Var.f130008r = p0(strTrim);
            } else if (i11 == 3) {
                k.p pVarP0 = p0(strTrim);
                f0Var.f130009s = pVarP0;
                if (pVarP0.g()) {
                    throw new o("Invalid <svg> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                k.p pVarP1 = p0(strTrim);
                f0Var.f130010t = pVarP1;
                if (pVarP1.g()) {
                    throw new o("Invalid <svg> element. height cannot be negative");
                }
            } else if (i11 == 5) {
                f0Var.f130011u = strTrim;
            }
        }
    }

    public final void R0(Attributes attributes) throws o {
        l("<polygon>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.z a0Var = new k.a0();
        a0Var.f130050a = this.f130198a;
        a0Var.f130051b = this.f130199b;
        E(a0Var, attributes);
        T(a0Var, attributes);
        X(a0Var, attributes);
        D(a0Var, attributes);
        O(a0Var, attributes, "polygon");
        this.f130199b.d(a0Var);
    }

    public final void S(k.d0 d0Var, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()] == 37) {
                d0Var.f129927h = o0(strTrim);
            }
        }
    }

    public final void S0(Attributes attributes) throws o {
        l("<polyline>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.z zVar = new k.z();
        zVar.f130050a = this.f130198a;
        zVar.f130051b = this.f130199b;
        E(zVar, attributes);
        T(zVar, attributes);
        X(zVar, attributes);
        D(zVar, attributes);
        O(zVar, attributes, "polyline");
        this.f130199b.d(zVar);
    }

    public final void T(k.l0 l0Var, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
                if (i11 == 45) {
                    F0(l0Var, strTrim);
                } else if (i11 != 46) {
                    if (l0Var.f130042e == null) {
                        l0Var.f130042e = new k.e0();
                    }
                    T0(l0Var.f130042e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    l0Var.f130044g = sc.c.f(strTrim);
                }
            }
        }
    }

    public final void U(k.u0 u0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()] == 6 && ("".equals(attributes.getURI(i10)) || f130184l.equals(attributes.getURI(i10)))) {
                u0Var.f130085o = strTrim;
            }
        }
    }

    public final void U0(Attributes attributes) throws o {
        l("<radialGradient>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.q0 q0Var = new k.q0();
        q0Var.f130050a = this.f130198a;
        q0Var.f130051b = this.f130199b;
        E(q0Var, attributes);
        T(q0Var, attributes);
        G(q0Var, attributes);
        P(q0Var, attributes);
        this.f130199b.d(q0Var);
        this.f130199b = q0Var;
    }

    public final void V(k.z0 z0Var, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                if (i11 == 39) {
                    z0Var.f130111p = p0(strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || f130184l.equals(attributes.getURI(i10))) {
                z0Var.f130110o = strTrim;
            }
        }
    }

    public final void V0(Attributes attributes) throws o {
        l("<rect>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.b0 b0Var = new k.b0();
        b0Var.f130050a = this.f130198a;
        b0Var.f130051b = this.f130199b;
        E(b0Var, attributes);
        T(b0Var, attributes);
        X(b0Var, attributes);
        D(b0Var, attributes);
        Q(b0Var, attributes);
        this.f130199b.d(b0Var);
    }

    public final void W(k.a1 a1Var, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                a1Var.f129904o = q0(strTrim);
            } else if (i11 == 2) {
                a1Var.f129905p = q0(strTrim);
            } else if (i11 == 19) {
                a1Var.f129906q = q0(strTrim);
            } else if (i11 == 20) {
                a1Var.f129907r = q0(strTrim);
            }
        }
    }

    public final void W0(Attributes attributes) throws o {
        l("<solidColor>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.c0 c0Var = new k.c0();
        c0Var.f130050a = this.f130198a;
        c0Var.f130051b = this.f130199b;
        E(c0Var, attributes);
        T(c0Var, attributes);
        this.f130199b.d(c0Var);
        this.f130199b = c0Var;
    }

    public final void X(k.n nVar, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.a(attributes.getLocalName(i10)) == g.transform) {
                nVar.m(K0(attributes.getValue(i10)));
            }
        }
    }

    public final void X0() {
        this.f130198a = new k();
    }

    public final void Y(k.e1 e1Var, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                e1Var.f130000q = p0(strTrim);
            } else if (i11 == 2) {
                e1Var.f130001r = p0(strTrim);
            } else if (i11 == 3) {
                k.p pVarP0 = p0(strTrim);
                e1Var.f130002s = pVarP0;
                if (pVarP0.g()) {
                    throw new o("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                k.p pVarP1 = p0(strTrim);
                e1Var.f130003t = pVarP1;
                if (pVarP1.g()) {
                    throw new o("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 == 6 && ("".equals(attributes.getURI(i10)) || f130184l.equals(attributes.getURI(i10)))) {
                e1Var.f129999p = strTrim;
            }
        }
    }

    public final void Y0(String str, String str2, String str3, Attributes attributes) throws o {
        if (this.f130200c) {
            this.f130201d++;
        }
        if (f130183k.equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVarA = h.a(str2);
            switch (a.f130207a[hVarA.ordinal()]) {
                case 1:
                    b1(attributes);
                    break;
                case 2:
                case 3:
                    r(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    j1(attributes);
                    break;
                case 6:
                    P0(attributes);
                    break;
                case 7:
                    V0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    o(attributes);
                    break;
                case 10:
                    w(attributes);
                    break;
                case 11:
                    S0(attributes);
                    break;
                case 12:
                    R0(attributes);
                    break;
                case 13:
                    e1(attributes);
                    break;
                case 14:
                    i1(attributes);
                    break;
                case 15:
                    h1(attributes);
                    break;
                case 16:
                    l1(attributes);
                    break;
                case 17:
                    c1(attributes);
                    break;
                case 18:
                    y(attributes);
                    break;
                case 19:
                    x(attributes);
                    break;
                case 20:
                    U0(attributes);
                    break;
                case 21:
                    Z0(attributes);
                    break;
                case 22:
                case 23:
                    this.f130202e = true;
                    this.f130203f = hVarA;
                    break;
                case 24:
                    k(attributes);
                    break;
                case 25:
                    g1(attributes);
                    break;
                case 26:
                    Q0(attributes);
                    break;
                case 27:
                    v(attributes);
                    break;
                case 28:
                    k1(attributes);
                    break;
                case 29:
                    z(attributes);
                    break;
                case 30:
                    a1(attributes);
                    break;
                case 31:
                    W0(attributes);
                    break;
                default:
                    this.f130200c = true;
                    this.f130201d = 1;
                    break;
            }
        }
    }

    public final void Z(k.r0 r0Var, Attributes attributes) throws o {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 7) {
                x0(r0Var, strTrim);
            } else if (i11 == 87) {
                r0Var.f130076p = O0(strTrim);
            }
        }
    }

    public final void Z0(Attributes attributes) throws o {
        l("<stop>", new Object[0]);
        k.j0 j0Var = this.f130199b;
        if (j0Var == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof k.j)) {
            throw new o("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        k.d0 d0Var = new k.d0();
        d0Var.f130050a = this.f130198a;
        d0Var.f130051b = this.f130199b;
        E(d0Var, attributes);
        T(d0Var, attributes);
        S(d0Var, attributes);
        this.f130199b.d(d0Var);
        this.f130199b = d0Var;
    }

    public final void a0(String str) {
        this.f130198a.a(new sc.c(sc.c.f.screen, sc.c.u.Document).d(str));
    }

    public final void a1(Attributes attributes) throws o {
        l("<style>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f130208b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 88) {
                zEquals = strTrim.equals(sc.c.f129748e);
            } else if (i11 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && sc.c.b(str, sc.c.f.screen)) {
            this.f130205h = true;
        } else {
            this.f130200c = true;
            this.f130201d = 1;
        }
    }

    public final void b1(Attributes attributes) throws o {
        l("<svg>", new Object[0]);
        k.f0 f0Var = new k.f0();
        f0Var.f130050a = this.f130198a;
        f0Var.f130051b = this.f130199b;
        E(f0Var, attributes);
        T(f0Var, attributes);
        D(f0Var, attributes);
        Z(f0Var, attributes);
        R(f0Var, attributes);
        k.j0 j0Var = this.f130199b;
        if (j0Var == null) {
            this.f130198a.Z(f0Var);
        } else {
            j0Var.d(f0Var);
        }
        this.f130199b = f0Var;
    }

    public final void c1(Attributes attributes) throws o {
        l("<symbol>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.r0 t0Var = new k.t0();
        t0Var.f130050a = this.f130198a;
        t0Var.f130051b = this.f130199b;
        E(t0Var, attributes);
        T(t0Var, attributes);
        D(t0Var, attributes);
        Z(t0Var, attributes);
        this.f130199b.d(t0Var);
        this.f130199b = t0Var;
    }

    public final void d1(String str) throws o {
        if (this.f130200c) {
            return;
        }
        if (this.f130202e) {
            if (this.f130204g == null) {
                this.f130204g = new StringBuilder(str.length());
            }
            this.f130204g.append(str);
        } else if (this.f130205h) {
            if (this.f130206i == null) {
                this.f130206i = new StringBuilder(str.length());
            }
            this.f130206i.append(str);
        } else if (this.f130199b instanceof k.y0) {
            h(str);
        }
    }

    public final void e1(Attributes attributes) throws o {
        l("<text>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.w0 w0Var = new k.w0();
        w0Var.f130050a = this.f130198a;
        w0Var.f130051b = this.f130199b;
        E(w0Var, attributes);
        T(w0Var, attributes);
        X(w0Var, attributes);
        D(w0Var, attributes);
        W(w0Var, attributes);
        this.f130199b.d(w0Var);
        this.f130199b = w0Var;
    }

    public final void f1(char[] cArr, int i10, int i11) throws o {
        if (this.f130200c) {
            return;
        }
        if (this.f130202e) {
            if (this.f130204g == null) {
                this.f130204g = new StringBuilder(i11);
            }
            this.f130204g.append(cArr, i10, i11);
        } else if (this.f130205h) {
            if (this.f130206i == null) {
                this.f130206i = new StringBuilder(i11);
            }
            this.f130206i.append(cArr, i10, i11);
        } else if (this.f130199b instanceof k.y0) {
            h(new String(cArr, i10, i11));
        }
    }

    public final void g1(Attributes attributes) throws o {
        l("<textPath>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.z0 z0Var = new k.z0();
        z0Var.f130050a = this.f130198a;
        z0Var.f130051b = this.f130199b;
        E(z0Var, attributes);
        T(z0Var, attributes);
        D(z0Var, attributes);
        V(z0Var, attributes);
        this.f130199b.d(z0Var);
        this.f130199b = z0Var;
        k.j0 j0Var = z0Var.f130051b;
        if (j0Var instanceof k.b1) {
            z0Var.l((k.b1) j0Var);
        } else {
            z0Var.l(((k.x0) j0Var).c());
        }
    }

    public final void h(String str) throws o {
        k.h0 h0Var = (k.h0) this.f130199b;
        int size = h0Var.f130014i.size();
        k.n0 n0Var = size == 0 ? null : h0Var.f130014i.get(size - 1);
        if (!(n0Var instanceof k.c1)) {
            this.f130199b.d(new k.c1(str));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        k.c1 c1Var = (k.c1) n0Var;
        sb2.append(c1Var.f129922c);
        sb2.append(str);
        c1Var.f129922c = sb2.toString();
    }

    public final void h1(Attributes attributes) throws o {
        l("<tref>", new Object[0]);
        k.j0 j0Var = this.f130199b;
        if (j0Var == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof k.y0)) {
            throw new o("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        k.u0 u0Var = new k.u0();
        u0Var.f130050a = this.f130198a;
        u0Var.f130051b = this.f130199b;
        E(u0Var, attributes);
        T(u0Var, attributes);
        D(u0Var, attributes);
        U(u0Var, attributes);
        this.f130199b.d(u0Var);
        k.j0 j0Var2 = u0Var.f130051b;
        if (j0Var2 instanceof k.b1) {
            u0Var.l((k.b1) j0Var2);
        } else {
            u0Var.l(((k.x0) j0Var2).c());
        }
    }

    public final void i(Attributes attributes) throws o {
        l("<circle>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.d dVar = new k.d();
        dVar.f130050a = this.f130198a;
        dVar.f130051b = this.f130199b;
        E(dVar, attributes);
        T(dVar, attributes);
        X(dVar, attributes);
        D(dVar, attributes);
        B(dVar, attributes);
        this.f130199b.d(dVar);
    }

    public final void i1(Attributes attributes) throws o {
        l("<tspan>", new Object[0]);
        k.j0 j0Var = this.f130199b;
        if (j0Var == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof k.y0)) {
            throw new o("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        k.v0 v0Var = new k.v0();
        v0Var.f130050a = this.f130198a;
        v0Var.f130051b = this.f130199b;
        E(v0Var, attributes);
        T(v0Var, attributes);
        D(v0Var, attributes);
        W(v0Var, attributes);
        this.f130199b.d(v0Var);
        this.f130199b = v0Var;
        k.j0 j0Var2 = v0Var.f130051b;
        if (j0Var2 instanceof k.b1) {
            v0Var.l((k.b1) j0Var2);
        } else {
            v0Var.l(((k.x0) j0Var2).c());
        }
    }

    public final void j1(Attributes attributes) throws o {
        l("<use>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.e1 e1Var = new k.e1();
        e1Var.f130050a = this.f130198a;
        e1Var.f130051b = this.f130199b;
        E(e1Var, attributes);
        T(e1Var, attributes);
        X(e1Var, attributes);
        D(e1Var, attributes);
        Y(e1Var, attributes);
        this.f130199b.d(e1Var);
        this.f130199b = e1Var;
    }

    public final void k(Attributes attributes) throws o {
        l("<clipPath>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.e eVar = new k.e();
        eVar.f130050a = this.f130198a;
        eVar.f130051b = this.f130199b;
        E(eVar, attributes);
        T(eVar, attributes);
        X(eVar, attributes);
        D(eVar, attributes);
        C(eVar, attributes);
        this.f130199b.d(eVar);
        this.f130199b = eVar;
    }

    public final void k1(Attributes attributes) throws o {
        l("<view>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.r0 f1Var = new k.f1();
        f1Var.f130050a = this.f130198a;
        f1Var.f130051b = this.f130199b;
        E(f1Var, attributes);
        D(f1Var, attributes);
        Z(f1Var, attributes);
        this.f130199b.d(f1Var);
        this.f130199b = f1Var;
    }

    public final void l1(Attributes attributes) throws o {
        l("<switch>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.s0 s0Var = new k.s0();
        s0Var.f130050a = this.f130198a;
        s0Var.f130051b = this.f130199b;
        E(s0Var, attributes);
        T(s0Var, attributes);
        X(s0Var, attributes);
        D(s0Var, attributes);
        this.f130199b.d(s0Var);
        this.f130199b = s0Var;
    }

    public final void m(Attributes attributes) throws o {
        l("<defs>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.h hVar = new k.h();
        hVar.f130050a = this.f130198a;
        hVar.f130051b = this.f130199b;
        E(hVar, attributes);
        T(hVar, attributes);
        X(hVar, attributes);
        this.f130199b.d(hVar);
        this.f130199b = hVar;
    }

    public final void n(k.n0 n0Var, String str) {
        Log.d(f130182j, str + n0Var);
        if (n0Var instanceof k.h0) {
            String str2 = str + vb.q.a.f140822e;
            Iterator<k.n0> it = ((k.h0) n0Var).f130014i.iterator();
            while (it.hasNext()) {
                n(it.next(), str2);
            }
        }
    }

    public final void o(Attributes attributes) throws o {
        l("<ellipse>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.i iVar = new k.i();
        iVar.f130050a = this.f130198a;
        iVar.f130051b = this.f130199b;
        E(iVar, attributes);
        T(iVar, attributes);
        X(iVar, attributes);
        D(iVar, attributes);
        F(iVar, attributes);
        this.f130199b.d(iVar);
    }

    public final Float o0(String str) throws o {
        if (str.length() == 0) {
            throw new o("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z10 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z10 = false;
        }
        try {
            float fH0 = h0(str, 0, length);
            float f10 = 100.0f;
            if (z10) {
                fH0 /= 100.0f;
            }
            if (fH0 < 0.0f) {
                f10 = 0.0f;
            } else if (fH0 <= 100.0f) {
                f10 = fH0;
            }
            return Float.valueOf(f10);
        } catch (NumberFormatException e10) {
            throw new o("Invalid offset value in <stop>: " + str, e10);
        }
    }

    public final void q(String str, String str2, String str3) throws o {
        if (this.f130200c) {
            int i10 = this.f130201d - 1;
            this.f130201d = i10;
            if (i10 == 0) {
                this.f130200c = false;
                return;
            }
        }
        if (f130183k.equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = a.f130207a[h.a(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case 22:
                    case 23:
                        this.f130202e = false;
                        StringBuilder sb2 = this.f130204g;
                        if (sb2 != null) {
                            h hVar = this.f130203f;
                            if (hVar == h.title) {
                                this.f130198a.a0(sb2.toString());
                            } else if (hVar == h.desc) {
                                this.f130198a.Q(sb2.toString());
                            }
                            this.f130204g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb3 = this.f130206i;
                        if (sb3 != null) {
                            this.f130205h = false;
                            a0(sb3.toString());
                            this.f130206i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f130199b = ((k.n0) this.f130199b).f130051b;
        }
    }

    public final void r(Attributes attributes) throws o {
        l("<g>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.m mVar = new k.m();
        mVar.f130050a = this.f130198a;
        mVar.f130051b = this.f130199b;
        E(mVar, attributes);
        T(mVar, attributes);
        X(mVar, attributes);
        D(mVar, attributes);
        this.f130199b.d(mVar);
        this.f130199b = mVar;
    }

    public final void s(String str, Map<String, String> map) {
        String str2;
        String strB;
        if (!str.equals(f130186n) || k.s() == null) {
            return;
        }
        if (map.get("type") == null || sc.c.f129748e.equals(map.get("type"))) {
            if ((map.get(f130188p) != null && !f130192t.equals(map.get(f130188p))) || (str2 = map.get(f130189q)) == null || (strB = k.s().b(str2)) == null) {
                return;
            }
            String str3 = map.get("media");
            if (str3 != null && !"all".equals(str3.trim())) {
                strB = "@media " + str3 + " { " + strB + "}";
            }
            a0(strB);
        }
    }

    public final void v(Attributes attributes) throws o {
        l("<image>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.o oVar = new k.o();
        oVar.f130050a = this.f130198a;
        oVar.f130051b = this.f130199b;
        E(oVar, attributes);
        T(oVar, attributes);
        X(oVar, attributes);
        D(oVar, attributes);
        H(oVar, attributes);
        this.f130199b.d(oVar);
        this.f130199b = oVar;
    }

    public final void w(Attributes attributes) throws o {
        l("<line>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.q qVar = new k.q();
        qVar.f130050a = this.f130198a;
        qVar.f130051b = this.f130199b;
        E(qVar, attributes);
        T(qVar, attributes);
        X(qVar, attributes);
        D(qVar, attributes);
        I(qVar, attributes);
        this.f130199b.d(qVar);
    }

    public final void x(Attributes attributes) throws o {
        l("<linearGradient>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.m0 m0Var = new k.m0();
        m0Var.f130050a = this.f130198a;
        m0Var.f130051b = this.f130199b;
        E(m0Var, attributes);
        T(m0Var, attributes);
        G(m0Var, attributes);
        J(m0Var, attributes);
        this.f130199b.d(m0Var);
        this.f130199b = m0Var;
    }

    public final void y(Attributes attributes) throws o {
        l("<marker>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.r rVar = new k.r();
        rVar.f130050a = this.f130198a;
        rVar.f130051b = this.f130199b;
        E(rVar, attributes);
        T(rVar, attributes);
        D(rVar, attributes);
        Z(rVar, attributes);
        K(rVar, attributes);
        this.f130199b.d(rVar);
        this.f130199b = rVar;
    }

    public final Map<String, String> y0(i iVar) {
        HashMap map = new HashMap();
        iVar.A();
        String strS = iVar.s(G5.T);
        while (strS != null) {
            iVar.f(G5.T);
            map.put(strS, iVar.q());
            iVar.A();
            strS = iVar.s(G5.T);
        }
        return map;
    }

    public final void z(Attributes attributes) throws o {
        l("<mask>", new Object[0]);
        if (this.f130199b == null) {
            throw new o("Invalid document. Root element must be <svg>");
        }
        k.s sVar = new k.s();
        sVar.f130050a = this.f130198a;
        sVar.f130051b = this.f130199b;
        E(sVar, attributes);
        T(sVar, attributes);
        D(sVar, attributes);
        L(sVar, attributes);
        this.f130199b.d(sVar);
        this.f130199b = sVar;
    }

    public final void p() {
    }

    public final void l(String str, Object... objArr) {
    }
}
