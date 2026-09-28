package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class bo20 implements ne80<zn20> {
    public static final bo20 a = new bo20();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ho20.b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            a = iArr;
        }
    }

    @Override // defpackage.ne80
    public final Unit a(Object obj, gdh0 gdh0Var) throws IOException {
        ho20 ho20VarB;
        Map<zn20.a<?>, Object> mapA = ((zn20) obj).a();
        fo20.a aVarP = fo20.p();
        for (Map.Entry<zn20.a<?>, Object> entry : mapA.entrySet()) {
            zn20.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.a;
            if (value instanceof Boolean) {
                ho20.a aVarX = ho20.x();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                aVarX.d();
                ((ho20) aVarX.b).y(zBooleanValue);
                ho20VarB = aVarX.b();
            } else if (value instanceof Float) {
                ho20.a aVarX2 = ho20.x();
                float fFloatValue = ((Number) value).floatValue();
                aVarX2.d();
                ((ho20) aVarX2.b).B(fFloatValue);
                ho20VarB = aVarX2.b();
            } else if (value instanceof Double) {
                ho20.a aVarX3 = ho20.x();
                double dDoubleValue = ((Number) value).doubleValue();
                aVarX3.d();
                ((ho20) aVarX3.b).A(dDoubleValue);
                ho20VarB = aVarX3.b();
            } else if (value instanceof Integer) {
                ho20.a aVarX4 = ho20.x();
                int iIntValue = ((Number) value).intValue();
                aVarX4.d();
                ((ho20) aVarX4.b).C(iIntValue);
                ho20VarB = aVarX4.b();
            } else if (value instanceof Long) {
                ho20.a aVarX5 = ho20.x();
                long jLongValue = ((Number) value).longValue();
                aVarX5.d();
                ((ho20) aVarX5.b).D(jLongValue);
                ho20VarB = aVarX5.b();
            } else if (value instanceof String) {
                ho20.a aVarX6 = ho20.x();
                aVarX6.d();
                ((ho20) aVarX6.b).E((String) value);
                ho20VarB = aVarX6.b();
            } else if (value instanceof Set) {
                ho20.a aVarX7 = ho20.x();
                go20.a aVarQ = go20.q();
                aVarQ.d();
                ((go20) aVarQ.b).n((Set) value);
                aVarX7.d();
                ((ho20) aVarX7.b).F(aVarQ.b());
                ho20VarB = aVarX7.b();
            } else {
                if (!(value instanceof byte[])) {
                    ib5.a("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return null;
                }
                ho20.a aVarX8 = ho20.x();
                byte[] bArr = (byte[]) value;
                pl5.f fVarC = pl5.c(bArr, 0, bArr.length);
                aVarX8.d();
                ((ho20) aVarX8.b).z(fVarC);
                ho20VarB = aVarX8.b();
            }
            aVarP.getClass();
            str.getClass();
            aVarP.d();
            fo20 fo20Var = (fo20) aVarP.b;
            int i = fo20.PREFERENCES_FIELD_NUMBER;
            fo20Var.o().put(str, ho20VarB);
        }
        fo20 fo20VarB = aVarP.b();
        int iC = fo20VarB.c(null);
        Logger logger = q08.c;
        if (iC > 4096) {
            iC = 4096;
        }
        q08.d dVar = new q08.d(gdh0Var, iC);
        fo20VarB.a(dVar);
        if (dVar.g > 0) {
            dVar.R0();
        }
        return Unit.a;
    }

    @Override // defpackage.ne80
    public final Object b(FileInputStream fileInputStream) throws j6b {
        byte[] bArr;
        try {
            fo20 fo20VarQ = fo20.q(fileInputStream);
            jtw jtwVar = new jtw(1, false);
            zn20.b[] bVarArr = (zn20.b[]) Arrays.copyOf(new zn20.b[0], 0);
            jtwVar.e();
            if (bVarArr.length > 0) {
                bVarArr[0].getClass();
                jtwVar.h(null, null);
                throw null;
            }
            Map<String, ho20> mapN = fo20VarQ.n();
            mapN.getClass();
            for (Map.Entry<String, ho20> entry : mapN.entrySet()) {
                String key = entry.getKey();
                ho20 value = entry.getValue();
                key.getClass();
                value.getClass();
                ho20.b bVarW = value.w();
                switch (bVarW == null ? -1 : a.a[bVarW.ordinal()]) {
                    case -1:
                        throw new j6b("Value case is null.", null);
                    case 0:
                    default:
                        uhc.a();
                        return null;
                    case 1:
                        jtwVar.h(new zn20.a<>(key), Boolean.valueOf(value.n()));
                        break;
                    case 2:
                        jtwVar.h(new zn20.a<>(key), Float.valueOf(value.r()));
                        break;
                    case 3:
                        jtwVar.h(new zn20.a<>(key), Double.valueOf(value.q()));
                        break;
                    case 4:
                        jtwVar.h(new zn20.a<>(key), Integer.valueOf(value.s()));
                        break;
                    case 5:
                        jtwVar.h(new zn20.a<>(key), Long.valueOf(value.t()));
                        break;
                    case 6:
                        zn20.a<?> aVar = new zn20.a<>(key);
                        String strU = value.u();
                        strU.getClass();
                        jtwVar.h(aVar, strU);
                        break;
                    case 7:
                        zn20.a<?> aVar2 = new zn20.a<>(key);
                        fyo.c cVarP = value.v().p();
                        cVarP.getClass();
                        jtwVar.h(aVar2, CollectionsKt.E0(cVarP));
                        break;
                    case 8:
                        zn20.a<?> aVar3 = new zn20.a<>(key);
                        pl5 pl5VarO = value.o();
                        int size = pl5VarO.size();
                        if (size == 0) {
                            bArr = fyo.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            pl5VarO.d(size, bArr2);
                            bArr = bArr2;
                        }
                        bArr.getClass();
                        jtwVar.h(aVar3, bArr);
                        break;
                    case 9:
                        throw new j6b("Value not set.", null);
                }
            }
            return new jtw(new LinkedHashMap(jtwVar.a()), true);
        } catch (e0p e) {
            throw new j6b("Unable to parse preferences proto.", e);
        }
    }

    @Override // defpackage.ne80
    public final zn20 getDefaultValue() {
        return new jtw(1, (boolean) (1 == true ? 1 : 0));
    }
}
