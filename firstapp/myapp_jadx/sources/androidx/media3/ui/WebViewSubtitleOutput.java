package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import defpackage.d09;
import defpackage.d150;
import defpackage.hce0;
import defpackage.j160;
import defpackage.j4c;
import defpackage.jff0;
import defpackage.jrh0;
import defpackage.ly0;
import defpackage.oe6;
import defpackage.pe4;
import defpackage.tug;
import defpackage.tx5;
import defpackage.ujm;
import defpackage.vee0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.a {
    public final CanvasSubtitleOutput a;
    public final a b;
    public List<j4c> c;
    public oe6 d;
    public float e;
    public int f;
    public float i;

    public class a extends WebView {
        @Override // android.webkit.WebView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            super.performClick();
            return false;
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = Collections.EMPTY_LIST;
        this.d = oe6.g;
        this.e = 0.0533f;
        this.f = 0;
        this.i = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.a = canvasSubtitleOutput;
        a aVar = new a(context, attributeSet);
        this.b = aVar;
        aVar.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(aVar);
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List<j4c> list, oe6 oe6Var, float f, int i, float f2) {
        this.d = oe6Var;
        this.e = f;
        this.f = i;
        this.i = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            j4c j4cVar = list.get(i2);
            if (j4cVar.d != null) {
                arrayList.add(j4cVar);
            } else {
                arrayList2.add(j4cVar);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, oe6Var, f, i, f2);
        invalidate();
    }

    public final String b(int i, float f) {
        float fB = vee0.b(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fB == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fB / getContext().getResources().getDisplayMetrics().density)};
        String str = jrh0.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0233  */
    /* JADX WARN: Code duplicated, block: B:104:0x024a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0250  */
    /* JADX WARN: Code duplicated, block: B:107:0x0263  */
    /* JADX WARN: Code duplicated, block: B:109:0x0281 A[LOOP:2: B:108:0x027f->B:109:0x0281, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a4 A[LOOP:3: B:111:0x029e->B:113:0x02a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:118:0x0305  */
    /* JADX WARN: Code duplicated, block: B:121:0x0315  */
    /* JADX WARN: Code duplicated, block: B:123:0x031b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0333  */
    /* JADX WARN: Code duplicated, block: B:126:0x0339  */
    /* JADX WARN: Code duplicated, block: B:127:0x034f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0355  */
    /* JADX WARN: Code duplicated, block: B:130:0x0358  */
    /* JADX WARN: Code duplicated, block: B:132:0x035c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0365  */
    /* JADX WARN: Code duplicated, block: B:135:0x036b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0385  */
    /* JADX WARN: Code duplicated, block: B:139:0x0389  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:146:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:148:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:150:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:155:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:160:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:164:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:167:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:168:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:169:0x0403  */
    /* JADX WARN: Code duplicated, block: B:170:0x0407  */
    /* JADX WARN: Code duplicated, block: B:172:0x040b  */
    /* JADX WARN: Code duplicated, block: B:173:0x040f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0413  */
    /* JADX WARN: Code duplicated, block: B:177:0x0424  */
    /* JADX WARN: Code duplicated, block: B:180:0x0428  */
    /* JADX WARN: Code duplicated, block: B:181:0x042e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0436  */
    /* JADX WARN: Code duplicated, block: B:185:0x0439 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x043b  */
    /* JADX WARN: Code duplicated, block: B:188:0x043e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0442  */
    /* JADX WARN: Code duplicated, block: B:190:0x0448  */
    /* JADX WARN: Code duplicated, block: B:191:0x044e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0454  */
    /* JADX WARN: Code duplicated, block: B:195:0x0462  */
    /* JADX WARN: Code duplicated, block: B:196:0x0465  */
    /* JADX WARN: Code duplicated, block: B:199:0x0478  */
    /* JADX WARN: Code duplicated, block: B:211:0x0490  */
    /* JADX WARN: Code duplicated, block: B:241:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:243:0x050b  */
    /* JADX WARN: Code duplicated, block: B:246:0x0520  */
    /* JADX WARN: Code duplicated, block: B:252:0x0551  */
    /* JADX WARN: Code duplicated, block: B:254:0x057a A[LOOP:6: B:253:0x0578->B:254:0x057a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:257:0x059a A[LOOP:7: B:256:0x0598->B:257:0x059a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:263:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:265:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:269:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:273:0x0610  */
    /* JADX WARN: Code duplicated, block: B:275:0x0613  */
    /* JADX WARN: Code duplicated, block: B:279:0x061a  */
    /* JADX WARN: Code duplicated, block: B:282:0x0633  */
    /* JADX WARN: Code duplicated, block: B:285:0x0650  */
    /* JADX WARN: Code duplicated, block: B:287:0x065b  */
    /* JADX WARN: Code duplicated, block: B:289:0x065e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0661  */
    /* JADX WARN: Code duplicated, block: B:291:0x0664  */
    /* JADX WARN: Code duplicated, block: B:293:0x0682  */
    /* JADX WARN: Code duplicated, block: B:311:0x052d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0174  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x0192  */
    /* JADX WARN: Code duplicated, block: B:62:0x0199  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x01af  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x02a4, please report this as an issue */
    public final void c() {
        String strConcat;
        String str;
        String str2;
        boolean z;
        float f;
        String str3;
        Layout.Alignment alignment;
        int i;
        Locale locale;
        int i2;
        Object obj;
        String str4;
        int i3;
        String str5;
        String str6;
        Object obj2;
        String str7;
        int i4;
        CharSequence charSequence;
        float f2;
        String str8;
        String str9;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i5;
        HashMap map;
        Iterator it;
        float f3;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i6;
        StringBuilder sb;
        int i7;
        int i8;
        androidx.media3.ui.a.C0066a c0066a;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i9;
        int size2;
        int i10;
        Object obj3;
        boolean z2;
        boolean z3;
        int i11;
        jff0 jff0Var;
        int i12;
        int i13;
        StringBuilder sb2;
        int i14;
        String str10;
        String strA;
        int i15;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size3;
        String str11;
        int spanStart;
        int spanEnd;
        androidx.media3.ui.a.c cVar;
        androidx.media3.ui.a.c cVar2;
        float f4;
        String str12;
        Layout.Alignment alignment2;
        String str13;
        int i16;
        int i17;
        String str14;
        String str15;
        String str16;
        boolean z4;
        WebViewSubtitleOutput webViewSubtitleOutput = this;
        Locale locale2 = Locale.US;
        StringBuilder sb3 = new StringBuilder();
        String strA2 = d09.a(webViewSubtitleOutput.d.a);
        String strB = webViewSubtitleOutput.b(webViewSubtitleOutput.f, webViewSubtitleOutput.e);
        float f5 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        oe6 oe6Var = webViewSubtitleOutput.d;
        int i18 = oe6Var.d;
        int i19 = oe6Var.e;
        int i20 = 2;
        int i21 = 1;
        if (i18 == 1) {
            Object[] objArr = {d09.a(i19)};
            String str17 = jrh0.a;
            strConcat = String.format(locale2, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr);
        } else if (i18 == 2) {
            String strA3 = d09.a(i19);
            String str18 = jrh0.a;
            strConcat = "0.1em 0.12em 0.15em ".concat(strA3);
        } else if (i18 == 3) {
            String strA4 = d09.a(i19);
            String str19 = jrh0.a;
            strConcat = "0.06em 0.08em 0.15em ".concat(strA4);
        } else if (i18 != 4) {
            strConcat = "unset";
        } else {
            String strA5 = d09.a(i19);
            String str20 = jrh0.a;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strA5);
        }
        Object[] objArr2 = {strA2, strB, fValueOf, strConcat};
        String str21 = jrh0.a;
        sb3.append(String.format(locale2, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr2));
        HashMap map2 = new HashMap();
        String strA6 = d09.a(webViewSubtitleOutput.d.b);
        String str22 = "background-color:";
        StringBuilder sb4 = new StringBuilder("background-color:");
        sb4.append(strA6);
        String str23 = ";";
        sb4.append(";");
        map2.put(".default_bg,.default_bg *", sb4.toString());
        int i22 = 0;
        while (i22 < webViewSubtitleOutput.c.size()) {
            j4c j4cVar = webViewSubtitleOutput.c.get(i22);
            float f6 = j4cVar.h;
            int i23 = j4cVar.p;
            float f7 = f6 != -3.4028235E38f ? f6 * 100.0f : 50.0f;
            float f8 = f5;
            int i24 = j4cVar.i;
            int i25 = -100;
            int i26 = i24 != i21 ? i24 != i20 ? 0 : -100 : -50;
            float f9 = j4cVar.e;
            if (f9 != -3.4028235E38f) {
                if (j4cVar.f != i21) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f9 * 100.0f));
                    int i27 = j4cVar.g;
                    if (i23 == i21) {
                        i25 = -(i27 != i21 ? i27 != 2 ? 0 : -100 : -50);
                    } else {
                        i25 = i27 != i21 ? i27 != 2 ? 0 : -100 : -50;
                    }
                } else {
                    i26 = i26;
                    if (f9 >= 0.0f) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f9 * f8));
                        z = false;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f9) - 1.0f) * f8));
                        z = true;
                    }
                    i25 = 0;
                }
                f = j4cVar.j;
                if (f != -3.4028235E38f) {
                    str3 = String.format(locale2, "%.2f%%", Float.valueOf(f * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str24 = str3;
                alignment = j4cVar.b;
                if (alignment == null) {
                    locale = locale2;
                    obj = "center";
                    i2 = 2;
                } else {
                    i = b.a[alignment.ordinal()];
                    locale = locale2;
                    if (i != 1) {
                        i2 = 2;
                        if (i != 2) {
                            obj = "center";
                        } else {
                            obj = "end";
                        }
                    } else {
                        i2 = 2;
                        obj = "start";
                    }
                }
                if (i23 != 1) {
                    str4 = "vertical-rl";
                } else if (i23 != i2) {
                    str4 = "horizontal-tb";
                } else {
                    str4 = "vertical-lr";
                }
                String str25 = str4;
                String strB2 = webViewSubtitleOutput.b(j4cVar.n, j4cVar.o);
                if (j4cVar.l) {
                    i3 = j4cVar.m;
                } else {
                    i3 = webViewSubtitleOutput.d.c;
                }
                String strA7 = d09.a(i3);
                if (i23 != 1) {
                    if (z) {
                        str5 = "left";
                    } else {
                        str5 = "right";
                    }
                    str6 = str5;
                    obj2 = "top";
                } else if (i23 != 2) {
                    obj2 = "left";
                    str6 = z ? "bottom" : "top";
                } else {
                    if (z) {
                        str5 = "right";
                    } else {
                        str5 = "left";
                    }
                    str6 = str5;
                    obj2 = "top";
                }
                if (i23 != 2 || i23 == 1) {
                    str7 = "height";
                    i4 = i25;
                    i25 = i26;
                } else {
                    str7 = "width";
                    i4 = i26;
                }
                String str26 = str7;
                charSequence = j4cVar.a;
                f2 = webViewSubtitleOutput.getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = androidx.media3.ui.a.a;
                int i28 = i4;
                int i29 = i22;
                str8 = "";
                if (charSequence == null) {
                    str9 = "start";
                    c0066a = new androidx.media3.ui.a.C0066a("", d150.i);
                } else {
                    str9 = "start";
                    if (charSequence instanceof Spanned) {
                        str8 = "";
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i5 = 0;
                        while (i5 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i5].getBackgroundColor()));
                            i5++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strA8 = hce0.a(iIntValue, "bg_");
                            Iterator it2 = it;
                            String strA9 = tx5.a(".", strA8, ",.", strA8, " *");
                            String strA10 = d09.a(iIntValue);
                            String str27 = jrh0.a;
                            Locale locale3 = Locale.US;
                            map.put(strA9, str22 + strA10 + str23);
                            it = it2;
                            f7 = f7;
                        }
                        f3 = f7;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i6 = 0;
                        for (length2 = spans.length; i6 < length2; length2 = i11) {
                            String str28 = str23;
                            obj3 = spans[i6];
                            String str29 = str22;
                            z2 = obj3 instanceof StrikethroughSpan;
                            String str30 = null;
                            if (z2) {
                                z3 = z2;
                                strA = "<span style='text-decoration:line-through;'>";
                            } else {
                                z3 = z2;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strA11 = d09.a(((ForegroundColorSpan) obj3).getForegroundColor());
                                    String str31 = jrh0.a;
                                    Locale locale4 = Locale.US;
                                    strA = tug.a("<span style='color:", strA11, ";'>");
                                } else {
                                    spans = spans;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        String str32 = jrh0.a;
                                        Locale locale5 = Locale.US;
                                        i11 = length2;
                                        strA = pe4.b(backgroundColor, "<span class='bg_", "'>");
                                    } else {
                                        i11 = length2;
                                        if (obj3 instanceof ujm) {
                                            strA = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size3 = absoluteSizeSpan.getSize();
                                            } else {
                                                size3 = absoluteSizeSpan.getSize() / f2;
                                            }
                                            Object[] objArr3 = {Float.valueOf(size3)};
                                            String str33 = jrh0.a;
                                            strA = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr3);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr4 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            String str34 = jrh0.a;
                                            strA = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr4);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                String str35 = jrh0.a;
                                                Locale locale6 = Locale.US;
                                                strA = tug.a("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strA = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strA = "<b>";
                                            } else if (style != 2) {
                                                strA = "<i>";
                                            } else if (style != 3) {
                                                strA = null;
                                            } else {
                                                strA = "<b><i>";
                                            }
                                        } else if (obj3 instanceof j160) {
                                            i15 = ((j160) obj3).b;
                                            if (i15 != -1) {
                                                strA = "<ruby style='ruby-position:unset;'>";
                                            } else if (i15 != 1) {
                                                strA = "<ruby style='ruby-position:over;'>";
                                            } else if (i15 != 2) {
                                                strA = null;
                                            } else {
                                                strA = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strA = "<u>";
                                        } else if (obj3 instanceof jff0) {
                                            jff0Var = (jff0) obj3;
                                            i12 = jff0Var.a;
                                            i13 = jff0Var.b;
                                            sb2 = new StringBuilder();
                                            if (i13 != 1) {
                                                i14 = 2;
                                                if (i13 == 2) {
                                                    sb2.append("open ");
                                                }
                                            } else {
                                                i14 = 2;
                                                sb2.append("filled ");
                                            }
                                            if (i12 != 0) {
                                                sb2.append("none");
                                            } else if (i12 != 1) {
                                                sb2.append("circle");
                                            } else if (i12 != i14) {
                                                sb2.append("dot");
                                            } else if (i12 != 3) {
                                                sb2.append("unset");
                                            } else {
                                                sb2.append("sesame");
                                            }
                                            String string = sb2.toString();
                                            if (jff0Var.c != 2) {
                                                str10 = "over right";
                                            } else {
                                                str10 = "under left";
                                            }
                                            Object[] objArr5 = {string, str10};
                                            String str36 = jrh0.a;
                                            strA = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr5);
                                        } else {
                                            strA = null;
                                        }
                                    }
                                }
                                if (z3 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof ujm) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof jff0)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str11 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                str30 = "</b>";
                                            } else if (style2 == 2) {
                                                str30 = "</i>";
                                            } else if (style2 == 3) {
                                                str30 = "</i></b>";
                                            }
                                        } else if (obj3 instanceof j160) {
                                            str30 = "<rt>" + androidx.media3.ui.a.a(((j160) obj3).a) + "</rt></ruby>";
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            str30 = "</u>";
                                        }
                                        str11 = str30;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strA != null) {
                                    str11.getClass();
                                    androidx.media3.ui.a.b bVar = new androidx.media3.ui.a.b(spanStart, spanEnd, strA, str11);
                                    cVar = (androidx.media3.ui.a.c) sparseArray.get(spanStart);
                                    if (cVar == null) {
                                        cVar = new androidx.media3.ui.a.c();
                                        sparseArray.put(spanStart, cVar);
                                    }
                                    cVar.a.add(bVar);
                                    cVar2 = (androidx.media3.ui.a.c) sparseArray.get(spanEnd);
                                    if (cVar2 == null) {
                                        cVar2 = new androidx.media3.ui.a.c();
                                        sparseArray.put(spanEnd, cVar2);
                                    }
                                    cVar2.b.add(bVar);
                                }
                                i6++;
                                spans = spans;
                                str23 = str28;
                                str22 = str29;
                            }
                            i11 = length2;
                            str11 = z3 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strA != null) {
                                str11.getClass();
                                androidx.media3.ui.a.b bVar2 = new androidx.media3.ui.a.b(spanStart, spanEnd, strA, str11);
                                cVar = (androidx.media3.ui.a.c) sparseArray.get(spanStart);
                                if (cVar == null) {
                                    cVar = new androidx.media3.ui.a.c();
                                    sparseArray.put(spanStart, cVar);
                                }
                                cVar.a.add(bVar2);
                                cVar2 = (androidx.media3.ui.a.c) sparseArray.get(spanEnd);
                                if (cVar2 == null) {
                                    cVar2 = new androidx.media3.ui.a.c();
                                    sparseArray.put(spanEnd, cVar2);
                                }
                                cVar2.b.add(bVar2);
                            }
                            i6++;
                            spans = spans;
                            str23 = str28;
                            str22 = str29;
                        }
                        str23 = str23;
                        str22 = str22;
                        sb = new StringBuilder(spanned.length());
                        i7 = 0;
                        i8 = 0;
                        while (i8 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i8);
                            sb.append(androidx.media3.ui.a.a(spanned.subSequence(i7, iKeyAt)));
                            androidx.media3.ui.a.c cVar3 = (androidx.media3.ui.a.c) sparseArray.get(iKeyAt);
                            ArrayList arrayList3 = cVar3.b;
                            arrayList = cVar3.a;
                            Collections.sort(arrayList3, androidx.media3.ui.a.b.f);
                            arrayList2 = cVar3.b;
                            size = arrayList2.size();
                            i9 = 0;
                            while (i9 < size) {
                                Object obj4 = arrayList2.get(i9);
                                i9++;
                                sb.append(((androidx.media3.ui.a.b) obj4).d);
                                arrayList2 = arrayList2;
                            }
                            Collections.sort(arrayList, androidx.media3.ui.a.b.e);
                            size2 = arrayList.size();
                            i10 = 0;
                            while (i10 < size2) {
                                Object obj5 = arrayList.get(i10);
                                i10++;
                                sb.append(((androidx.media3.ui.a.b) obj5).c);
                            }
                            i8++;
                            i7 = iKeyAt;
                        }
                        sb.append(androidx.media3.ui.a.a(spanned.subSequence(i7, spanned.length())));
                        c0066a = new androidx.media3.ui.a.C0066a(sb.toString(), map);
                    } else {
                        c0066a = new androidx.media3.ui.a.C0066a(androidx.media3.ui.a.a(charSequence), d150.i);
                    }
                    for (String str37 : map2.keySet()) {
                        str16 = (String) map2.put(str37, (String) map2.get(str37));
                        if (str16 != null || str16.equals(map2.get(str37))) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ly0.f(z4);
                    }
                    Integer numValueOf = Integer.valueOf(i29);
                    Float fValueOf2 = Float.valueOf(f3);
                    Integer numValueOf2 = Integer.valueOf(i28);
                    Integer numValueOf3 = Integer.valueOf(i25);
                    f4 = j4cVar.q;
                    if (f4 != 0.0f) {
                        if (i23 != 2 || i23 == 1) {
                            str15 = "skewY";
                        } else {
                            str15 = "skewX";
                        }
                        Object[] objArr6 = {str15, Float.valueOf(f4)};
                        String str38 = jrh0.a;
                        str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr6);
                    } else {
                        str12 = str8;
                    }
                    sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str6, str2, str26, str24, obj, str25, strB2, strA7, numValueOf2, numValueOf3, str12));
                    sb3.append("<span class='default_bg'>");
                    alignment2 = j4cVar.c;
                    str13 = c0066a.a;
                    if (alignment2 != null) {
                        i17 = b.a[alignment2.ordinal()];
                        if (i17 != 1) {
                            i16 = 2;
                            if (i17 != 2) {
                                str14 = "center";
                            } else {
                                str14 = "end";
                            }
                        } else {
                            i16 = 2;
                            str14 = str9;
                        }
                        sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                        sb3.append(str13);
                        sb3.append("</span>");
                    } else {
                        i16 = 2;
                        sb3.append(str13);
                    }
                    sb3.append("</span></div>");
                    i22 = i29 + 1;
                    webViewSubtitleOutput = this;
                    i20 = i16;
                    locale2 = locale;
                    f5 = f8;
                    str23 = str23;
                    str22 = str22;
                    i21 = 1;
                }
                f3 = f7;
                while (r0.hasNext()) {
                    str16 = (String) map2.put(str37, (String) map2.get(str37));
                    if (str16 != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    ly0.f(z4);
                }
                Integer numValueOf4 = Integer.valueOf(i29);
                Float fValueOf3 = Float.valueOf(f3);
                Integer numValueOf5 = Integer.valueOf(i28);
                Integer numValueOf6 = Integer.valueOf(i25);
                f4 = j4cVar.q;
                if (f4 != 0.0f) {
                    if (i23 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    Object[] objArr7 = {str15, Float.valueOf(f4)};
                    String str39 = jrh0.a;
                    str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                } else {
                    str12 = str8;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str6, str2, str26, str24, obj, str25, strB2, strA7, numValueOf5, numValueOf6, str12));
                sb3.append("<span class='default_bg'>");
                alignment2 = j4cVar.c;
                str13 = c0066a.a;
                if (alignment2 != null) {
                    i17 = b.a[alignment2.ordinal()];
                    if (i17 != 1) {
                        i16 = 2;
                        if (i17 != 2) {
                            str14 = "center";
                        } else {
                            str14 = "end";
                        }
                    } else {
                        i16 = 2;
                        str14 = str9;
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                    sb3.append(str13);
                    sb3.append("</span>");
                } else {
                    i16 = 2;
                    sb3.append(str13);
                }
                sb3.append("</span></div>");
                i22 = i29 + 1;
                webViewSubtitleOutput = this;
                i20 = i16;
                locale2 = locale;
                f5 = f8;
                str23 = str23;
                str22 = str22;
                i21 = 1;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - webViewSubtitleOutput.i) * 100.0f));
            }
            str2 = str;
            z = false;
            f = j4cVar.j;
            if (f != -3.4028235E38f) {
                str3 = String.format(locale2, "%.2f%%", Float.valueOf(f * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str210 = str3;
            alignment = j4cVar.b;
            if (alignment == null) {
                locale = locale2;
                obj = "center";
                i2 = 2;
            } else {
                i = b.a[alignment.ordinal()];
                locale = locale2;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        obj = "center";
                    } else {
                        obj = "end";
                    }
                } else {
                    i2 = 2;
                    obj = "start";
                }
            }
            if (i23 != 1) {
                str4 = "vertical-rl";
            } else if (i23 != i2) {
                str4 = "horizontal-tb";
            } else {
                str4 = "vertical-lr";
            }
            String str211 = str4;
            String strB3 = webViewSubtitleOutput.b(j4cVar.n, j4cVar.o);
            if (j4cVar.l) {
                i3 = j4cVar.m;
            } else {
                i3 = webViewSubtitleOutput.d.c;
            }
            String strA12 = d09.a(i3);
            if (i23 != 1) {
                if (z) {
                    str5 = "left";
                } else {
                    str5 = "right";
                }
                str6 = str5;
                obj2 = "top";
            } else if (i23 != 2) {
                obj2 = "left";
                str6 = z ? "bottom" : "top";
            } else {
                if (z) {
                    str5 = "right";
                } else {
                    str5 = "left";
                }
                str6 = str5;
                obj2 = "top";
            }
            if (i23 != 2) {
                str7 = "height";
                i4 = i25;
                i25 = i26;
            } else {
                str7 = "height";
                i4 = i25;
                i25 = i26;
            }
            String str212 = str7;
            charSequence = j4cVar.a;
            f2 = webViewSubtitleOutput.getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = androidx.media3.ui.a.a;
            int i210 = i4;
            int i211 = i22;
            str8 = "";
            if (charSequence == null) {
                str9 = "start";
                c0066a = new androidx.media3.ui.a.C0066a("", d150.i);
            } else {
                str9 = "start";
                if (charSequence instanceof Spanned) {
                    c0066a = new androidx.media3.ui.a.C0066a(androidx.media3.ui.a.a(charSequence), d150.i);
                } else {
                    str8 = "";
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i5 = 0;
                    while (i5 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i5].getBackgroundColor()));
                        i5++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strA13 = hce0.a(iIntValue2, "bg_");
                        Iterator it3 = it;
                        String strA14 = tx5.a(".", strA13, ",.", strA13, " *");
                        String strA15 = d09.a(iIntValue2);
                        String str213 = jrh0.a;
                        Locale locale7 = Locale.US;
                        map.put(strA14, str22 + strA15 + str23);
                        it = it3;
                        f7 = f7;
                    }
                    f3 = f7;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i6 = 0;
                    while (i6 < length2) {
                        String str214 = str23;
                        obj3 = spans[i6];
                        String str215 = str22;
                        z2 = obj3 instanceof StrikethroughSpan;
                        String str310 = null;
                        if (z2) {
                            z3 = z2;
                            strA = "<span style='text-decoration:line-through;'>";
                        } else {
                            z3 = z2;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strA16 = d09.a(((ForegroundColorSpan) obj3).getForegroundColor());
                                String str311 = jrh0.a;
                                Locale locale8 = Locale.US;
                                strA = tug.a("<span style='color:", strA16, ";'>");
                            } else {
                                spans = spans;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    String str312 = jrh0.a;
                                    Locale locale9 = Locale.US;
                                    i11 = length2;
                                    strA = pe4.b(backgroundColor2, "<span class='bg_", "'>");
                                } else {
                                    i11 = length2;
                                    if (obj3 instanceof ujm) {
                                        strA = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size3 = absoluteSizeSpan.getSize();
                                        } else {
                                            size3 = absoluteSizeSpan.getSize() / f2;
                                        }
                                        Object[] objArr8 = {Float.valueOf(size3)};
                                        String str313 = jrh0.a;
                                        strA = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr8);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr9 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        String str314 = jrh0.a;
                                        strA = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr9);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            String str315 = jrh0.a;
                                            Locale locale10 = Locale.US;
                                            strA = tug.a("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strA = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strA = "<b>";
                                        } else if (style != 2) {
                                            strA = "<i>";
                                        } else if (style != 3) {
                                            strA = null;
                                        } else {
                                            strA = "<b><i>";
                                        }
                                    } else if (obj3 instanceof j160) {
                                        i15 = ((j160) obj3).b;
                                        if (i15 != -1) {
                                            strA = "<ruby style='ruby-position:unset;'>";
                                        } else if (i15 != 1) {
                                            strA = "<ruby style='ruby-position:over;'>";
                                        } else if (i15 != 2) {
                                            strA = null;
                                        } else {
                                            strA = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strA = "<u>";
                                    } else if (obj3 instanceof jff0) {
                                        jff0Var = (jff0) obj3;
                                        i12 = jff0Var.a;
                                        i13 = jff0Var.b;
                                        sb2 = new StringBuilder();
                                        if (i13 != 1) {
                                            i14 = 2;
                                            if (i13 == 2) {
                                                sb2.append("open ");
                                            }
                                        } else {
                                            i14 = 2;
                                            sb2.append("filled ");
                                        }
                                        if (i12 != 0) {
                                            sb2.append("none");
                                        } else if (i12 != 1) {
                                            sb2.append("circle");
                                        } else if (i12 != i14) {
                                            sb2.append("dot");
                                        } else if (i12 != 3) {
                                            sb2.append("unset");
                                        } else {
                                            sb2.append("sesame");
                                        }
                                        String string2 = sb2.toString();
                                        if (jff0Var.c != 2) {
                                            str10 = "over right";
                                        } else {
                                            str10 = "under left";
                                        }
                                        Object[] objArr10 = {string2, str10};
                                        String str316 = jrh0.a;
                                        strA = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr10);
                                    } else {
                                        strA = null;
                                    }
                                }
                            }
                            if (z3) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strA != null) {
                                str11.getClass();
                                androidx.media3.ui.a.b bVar3 = new androidx.media3.ui.a.b(spanStart, spanEnd, strA, str11);
                                cVar = (androidx.media3.ui.a.c) sparseArray.get(spanStart);
                                if (cVar == null) {
                                    cVar = new androidx.media3.ui.a.c();
                                    sparseArray.put(spanStart, cVar);
                                }
                                cVar.a.add(bVar3);
                                cVar2 = (androidx.media3.ui.a.c) sparseArray.get(spanEnd);
                                if (cVar2 == null) {
                                    cVar2 = new androidx.media3.ui.a.c();
                                    sparseArray.put(spanEnd, cVar2);
                                }
                                cVar2.b.add(bVar3);
                            }
                            i6++;
                            spans = spans;
                            str23 = str214;
                            str22 = str215;
                        }
                        i11 = length2;
                        if (z3) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strA != null) {
                            str11.getClass();
                            androidx.media3.ui.a.b bVar4 = new androidx.media3.ui.a.b(spanStart, spanEnd, strA, str11);
                            cVar = (androidx.media3.ui.a.c) sparseArray.get(spanStart);
                            if (cVar == null) {
                                cVar = new androidx.media3.ui.a.c();
                                sparseArray.put(spanStart, cVar);
                            }
                            cVar.a.add(bVar4);
                            cVar2 = (androidx.media3.ui.a.c) sparseArray.get(spanEnd);
                            if (cVar2 == null) {
                                cVar2 = new androidx.media3.ui.a.c();
                                sparseArray.put(spanEnd, cVar2);
                            }
                            cVar2.b.add(bVar4);
                        }
                        i6++;
                        spans = spans;
                        str23 = str214;
                        str22 = str215;
                    }
                    str23 = str23;
                    str22 = str22;
                    sb = new StringBuilder(spanned.length());
                    i7 = 0;
                    i8 = 0;
                    while (i8 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i8);
                        sb.append(androidx.media3.ui.a.a(spanned.subSequence(i7, iKeyAt2)));
                        androidx.media3.ui.a.c cVar4 = (androidx.media3.ui.a.c) sparseArray.get(iKeyAt2);
                        ArrayList arrayList4 = cVar4.b;
                        arrayList = cVar4.a;
                        Collections.sort(arrayList4, androidx.media3.ui.a.b.f);
                        arrayList2 = cVar4.b;
                        size = arrayList2.size();
                        i9 = 0;
                        while (i9 < size) {
                            Object obj6 = arrayList2.get(i9);
                            i9++;
                            sb.append(((androidx.media3.ui.a.b) obj6).d);
                            arrayList2 = arrayList2;
                        }
                        Collections.sort(arrayList, androidx.media3.ui.a.b.e);
                        size2 = arrayList.size();
                        i10 = 0;
                        while (i10 < size2) {
                            Object obj7 = arrayList.get(i10);
                            i10++;
                            sb.append(((androidx.media3.ui.a.b) obj7).c);
                        }
                        i8++;
                        i7 = iKeyAt2;
                    }
                    sb.append(androidx.media3.ui.a.a(spanned.subSequence(i7, spanned.length())));
                    c0066a = new androidx.media3.ui.a.C0066a(sb.toString(), map);
                }
                while (r0.hasNext()) {
                    str16 = (String) map2.put(str37, (String) map2.get(str37));
                    if (str16 != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    ly0.f(z4);
                }
                Integer numValueOf7 = Integer.valueOf(i211);
                Float fValueOf4 = Float.valueOf(f3);
                Integer numValueOf8 = Integer.valueOf(i210);
                Integer numValueOf9 = Integer.valueOf(i25);
                f4 = j4cVar.q;
                if (f4 != 0.0f) {
                    if (i23 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    Object[] objArr11 = {str15, Float.valueOf(f4)};
                    String str317 = jrh0.a;
                    str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr11);
                } else {
                    str12 = str8;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str6, str2, str212, str210, obj, str211, strB3, strA12, numValueOf8, numValueOf9, str12));
                sb3.append("<span class='default_bg'>");
                alignment2 = j4cVar.c;
                str13 = c0066a.a;
                if (alignment2 != null) {
                    i17 = b.a[alignment2.ordinal()];
                    if (i17 != 1) {
                        i16 = 2;
                        if (i17 != 2) {
                            str14 = "center";
                        } else {
                            str14 = "end";
                        }
                    } else {
                        i16 = 2;
                        str14 = str9;
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                    sb3.append(str13);
                    sb3.append("</span>");
                } else {
                    i16 = 2;
                    sb3.append(str13);
                }
                sb3.append("</span></div>");
                i22 = i211 + 1;
                webViewSubtitleOutput = this;
                i20 = i16;
                locale2 = locale;
                f5 = f8;
                str23 = str23;
                str22 = str22;
                i21 = 1;
            }
            f3 = f7;
            while (r0.hasNext()) {
                str16 = (String) map2.put(str37, (String) map2.get(str37));
                if (str16 != null) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                ly0.f(z4);
            }
            Integer numValueOf10 = Integer.valueOf(i211);
            Float fValueOf5 = Float.valueOf(f3);
            Integer numValueOf11 = Integer.valueOf(i210);
            Integer numValueOf12 = Integer.valueOf(i25);
            f4 = j4cVar.q;
            if (f4 != 0.0f) {
                if (i23 != 2) {
                    str15 = "skewY";
                } else {
                    str15 = "skewY";
                }
                Object[] objArr12 = {str15, Float.valueOf(f4)};
                String str318 = jrh0.a;
                str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
            } else {
                str12 = str8;
            }
            sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str6, str2, str212, str210, obj, str211, strB3, strA12, numValueOf11, numValueOf12, str12));
            sb3.append("<span class='default_bg'>");
            alignment2 = j4cVar.c;
            str13 = c0066a.a;
            if (alignment2 != null) {
                i17 = b.a[alignment2.ordinal()];
                if (i17 != 1) {
                    i16 = 2;
                    if (i17 != 2) {
                        str14 = "center";
                    } else {
                        str14 = "end";
                    }
                } else {
                    i16 = 2;
                    str14 = str9;
                }
                sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                sb3.append(str13);
                sb3.append("</span>");
            } else {
                i16 = 2;
                sb3.append(str13);
            }
            sb3.append("</span></div>");
            i22 = i211 + 1;
            webViewSubtitleOutput = this;
            i20 = i16;
            locale2 = locale;
            f5 = f8;
            str23 = str23;
            str22 = str22;
            i21 = 1;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<html><head><style>");
        for (String str40 : map2.keySet()) {
            sb5.append(str40);
            sb5.append("{");
            sb5.append((String) map2.get(str40));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb3.insert(0, (CharSequence) sb5);
        this.b.loadData(Base64.encodeToString(sb3.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        c();
    }
}
