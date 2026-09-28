package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.sporty.android.core.model.service.CountryCodeName;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class uti {
    public final psm a;
    public final e5k b;
    public Map<String, String> c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class a {
        public static final /* synthetic */ a[] a = {new a("SYMBOL", 0), new a(xOgHBQVl.FysKVdDiC, 1)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) a.clone();
        }
    }

    public uti(psm psmVar, e5k e5kVar) {
        psmVar.getClass();
        this.a = psmVar;
        this.b = e5kVar;
    }

    public static String b(String str, String str2, String str3, boolean z, boolean z2) {
        try {
            double dH = h(str);
            NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
            numberInstance.setMinimumFractionDigits(z2 ? 0 : 2);
            numberInstance.setMaximumFractionDigits(2);
            String str4 = numberInstance.format(dH);
            if (z) {
                return str2 + str3 + str4;
            }
            return str4 + str3 + str2;
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            StringBuilder sbA = ce7.a(aVar, "FormatCurrency", "Failed to format with code for currency: ", str2, ", amount: ");
            sbA.append(str);
            aVar.f(e, sbA.toString(), new Object[0]);
            return z ? oxc.a(str2, str3, str) : oxc.a(str, str3, str2);
        }
    }

    public static Object f(uti utiVar, String str, String str2, x1b x1bVar) {
        a[] aVarArr = a.a;
        utiVar.getClass();
        return utiVar.c(str, str2, null, true, true, "", x1bVar);
    }

    public static Object g(uti utiVar, String str, String str2, boolean z, x1b x1bVar, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        psm psmVar = utiVar.a;
        if (psmVar.s()) {
            return b(str, str2, " ", true, z2);
        }
        if (psmVar.F()) {
            return utiVar.c(str, str2, "mxn_name", false, z2, " ", x1bVar);
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return utiVar.c(str, str2, lowerCase, true, z2, " ", x1bVar);
    }

    public static double h(String str) {
        return Double.parseDouble(StringsKt.t0(c.p(c.p(str, ",", "", false), " ", "", false)).toString());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r11 == r0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, boolean r10, defpackage.x1b r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.vti
            if (r0 == 0) goto L14
            r0 = r11
            vti r0 = (defpackage.vti) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            vti r0 = new vti
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.c
            y5b r0 = defpackage.y5b.a
            int r1 = r5.e
            r2 = 0
            java.lang.String r3 = " "
            r4 = 2
            r6 = 1
            if (r1 == 0) goto L3d
            if (r1 == r6) goto L35
            if (r1 != r4) goto L2f
            defpackage.uj50.b(r11)
            return r11
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L35:
            java.lang.String r9 = r5.b
            java.lang.String r8 = r5.a
            defpackage.uj50.b(r11)
            goto L55
        L3d:
            defpackage.uj50.b(r11)
            psm r11 = r7.a
            boolean r11 = r11.F()
            if (r11 == 0) goto L68
            r5.a = r8
            r5.b = r9
            r5.e = r6
            java.lang.Object r11 = r7.e(r5)
            if (r11 != r0) goto L55
            goto L85
        L55:
            java.util.Map r11 = (java.util.Map) r11
            java.lang.String r7 = "mxn_name"
            java.lang.Object r7 = r11.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L62
            goto L63
        L62:
            r9 = r7
        L63:
            java.lang.String r7 = defpackage.oxc.a(r8, r3, r9)
            return r7
        L68:
            java.lang.Double r11 = kotlin.text.b.h(r8)
            if (r11 != 0) goto L73
            java.lang.String r7 = defpackage.oxc.a(r9, r3, r8)
            return r7
        L73:
            r5.a = r2
            r5.b = r2
            r5.e = r4
            r6 = 20
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r7 = g(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L86
        L85:
            return r0
        L86:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uti.a(java.lang.String, java.lang.String, boolean, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1 A[Catch: Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:12:0x0034, B:28:0x007d, B:31:0x0099, B:35:0x00a5, B:37:0x00b1, B:39:0x00c4), top: B:45:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4 A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #1 {Exception -> 0x0038, blocks: (B:12:0x0034, B:28:0x007d, B:31:0x0099, B:35:0x00a5, B:37:0x00b1, B:39:0x00c4), top: B:45:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00b1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00c4, please report this as an issue */
    public final Object c(String str, String str2, String str3, boolean z, boolean z2, String str4, x1b x1bVar) {
        wti wtiVar;
        String str5;
        String str6;
        Locale locale;
        double d;
        String str7;
        String symbol;
        int i;
        String str8;
        if (x1bVar instanceof wti) {
            wtiVar = (wti) x1bVar;
            int i2 = wtiVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wtiVar.z = i2 - Integer.MIN_VALUE;
            } else {
                wtiVar = new wti(this, x1bVar);
            }
        } else {
            wtiVar = new wti(this, x1bVar);
        }
        Object obj = wtiVar.w;
        Object obj2 = y5b.a;
        int i3 = wtiVar.z;
        if (i3 != 0) {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = wtiVar.v;
            z2 = wtiVar.i;
            z = wtiVar.f;
            str6 = wtiVar.e;
            locale = wtiVar.d;
            str4 = wtiVar.c;
            str5 = wtiVar.b;
            try {
                uj50.b(obj);
                str7 = (String) ((Map) obj).get(str6);
                String upperCase = str5.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                symbol = Currency.getInstance(upperCase).getSymbol(locale);
                if (str7 == null) {
                    str7 = symbol;
                }
                NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
                if (z2) {
                    i = 0;
                } else {
                    i = 2;
                }
                numberInstance.setMinimumFractionDigits(i);
                numberInstance.setMaximumFractionDigits(2);
                str8 = numberInstance.format(d);
                if (z) {
                    return str7 + str4 + str8;
                }
                return str8 + str4 + str7;
            } catch (Exception e) {
                e = e;
                str = wtiVar.a;
                str2 = str5;
                itf0.a aVar = itf0.a;
                StringBuilder sbA = ce7.a(aVar, "FormatCurrency", "Failed to format with symbol for currency: ", str2, ", amount: ");
                sbA.append(str);
                aVar.f(e, sbA.toString(), new Object[0]);
                return b(str, str2, str4, z, z2);
            }
        }
        uj50.b(obj);
        try {
            double dH = h(str);
            Locale localeD = d();
            if (str3 == null) {
                str3 = str2.toLowerCase(Locale.ROOT);
                str3.getClass();
            }
            wtiVar.a = str;
            wtiVar.b = str2;
            wtiVar.c = str4;
            wtiVar.d = localeD;
            wtiVar.e = str3;
            wtiVar.f = z;
            wtiVar.i = z2;
            wtiVar.v = dH;
            wtiVar.z = 1;
            Object objE = e(wtiVar);
            if (objE == obj2) {
                return obj2;
            }
            str5 = str2;
            str6 = str3;
            locale = localeD;
            obj = objE;
            d = dH;
            str7 = (String) ((Map) obj).get(str6);
            String upperCase2 = str5.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            symbol = Currency.getInstance(upperCase2).getSymbol(locale);
            if (str7 == null) {
                str7 = symbol;
            }
            NumberFormat numberInstance2 = NumberFormat.getNumberInstance(Locale.US);
            if (z2) {
                i = 0;
            } else {
                i = 2;
            }
            numberInstance2.setMinimumFractionDigits(i);
            numberInstance2.setMaximumFractionDigits(2);
            str8 = numberInstance2.format(d);
            if (z) {
                return str7 + str4 + str8;
            }
            return str8 + str4 + str7;
        } catch (Exception e2) {
            e = e2;
            itf0.a aVar2 = itf0.a;
            StringBuilder sbA2 = ce7.a(aVar2, "FormatCurrency", "Failed to format with symbol for currency: ", str2, ", amount: ");
            sbA2.append(str);
            aVar2.f(e, sbA2.toString(), new Object[0]);
            return b(str, str2, str4, z, z2);
        }
    }

    public final Locale d() {
        Locale locale;
        try {
            CountryCodeName countryCode = this.a.getCountryCode();
            if (StringsKt.U(countryCode.getCode())) {
                locale = Locale.getDefault();
            } else {
                String upperCase = countryCode.getCode().toUpperCase(Locale.ROOT);
                upperCase.getClass();
                locale = new Locale("en", upperCase);
            }
            locale.getClass();
            return locale;
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("FormatCurrency");
            aVar.f(e, "Failed to get locale for country, using default", new Object[0]);
            Locale locale2 = Locale.getDefault();
            locale2.getClass();
            return locale2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(x1b x1bVar) {
        xti xtiVar;
        if (x1bVar instanceof xti) {
            xtiVar = (xti) x1bVar;
            int i = xtiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xtiVar.c = i - Integer.MIN_VALUE;
            } else {
                xtiVar = new xti(this, x1bVar);
            }
        } else {
            xtiVar = new xti(this, x1bVar);
        }
        Object objA = xtiVar.a;
        Object obj = y5b.a;
        int i2 = xtiVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            Map<String, String> map = this.c;
            if (map != null) {
                return map;
            }
            xtiVar.c = 1;
            objA = this.b.a(xtiVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        Map<String, String> map2 = (Map) objA;
        this.c = map2;
        return map2;
    }
}
