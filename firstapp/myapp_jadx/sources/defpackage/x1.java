package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x1 implements mfb0 {
    public Bitmap a;

    public static void B(String str, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length == 2) {
                arrayList.add(strArrSplit[0]);
                arrayList.add(strArrSplit[1]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.mfb0
    public ArrayList A(String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        B(str, arrayList);
        return arrayList;
    }

    @Override // defpackage.mfb0
    public final Drawable d() {
        return this.a == null ? gr0.a(hp0.A, R.drawable.ic_sport_default) : new BitmapDrawable(hp0.A.getResources(), this.a);
    }

    @Override // defpackage.mfb0
    public boolean e() {
        String id = getId();
        id.getClass();
        switch (id) {
            case "sr:sport:1":
            case "sr:sport:2":
            case "sr:sport:137":
            case "sr:sport:153":
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.mfb0
    public String f(String str, String str2, String str3) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder();
        if (str != null && (iIndexOf = str.indexOf(":")) > 0) {
            sb.append(str.substring(0, iIndexOf));
            sb.append("'");
        }
        if (!TextUtils.isEmpty(str3)) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    @Override // defpackage.mfb0
    public final boolean h() {
        return l() > 0.0f;
    }

    @Override // defpackage.mfb0
    public RegularMarketRule j() {
        return n();
    }

    @Override // defpackage.mfb0
    public boolean k() {
        return this instanceof x9i;
    }

    @Override // defpackage.mfb0
    public float l() {
        return 0.9611111f;
    }

    @Override // defpackage.mfb0
    public String p(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    @Override // defpackage.mfb0
    public boolean s() {
        String id = getId();
        id.getClass();
        switch (id) {
            case "sr:sport:109":
            case "sr:sport:110":
            case "sr:sport:111":
            case "sr:sport:202120001":
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.mfb0
    public final void t() {
        if (this.a != null) {
            return;
        }
        ea50 ea50VarE = com.bumptech.glide.a.d(hp0.A).k().P(a()).e(hre.c);
        ea50VarE.L(new a(zch0.a(hp0.A, 24), zch0.a(hp0.A, 24)), null, ea50VarE, fug.a);
    }

    @Override // defpackage.mfb0
    public String y() {
        return " & ";
    }

    @Override // defpackage.mfb0
    public boolean u() {
        String id = getId();
        id.getClass();
        byte b = -1;
        switch (id.hashCode()) {
            case -709302592:
                if (id.equals("sr:sport:21")) {
                    b = 0;
                }
                break;
            case -513544807:
                if (id.equals("sr:sport:109")) {
                    b = 1;
                }
                break;
            case -513544785:
                if (id.equals(CaxEybC.xzogFHblvmSdl)) {
                    b = 2;
                }
                break;
            case -513544784:
                if (id.equals("sr:sport:111")) {
                    b = 3;
                }
                break;
            case -513544778:
                if (id.equals("sr:sport:117")) {
                    b = 4;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return false;
            default:
                return true;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class a extends ujc<Bitmap> {
        public a(int i, int i2) {
            super(i, i2);
        }

        @Override // defpackage.d5f0
        public final void e(Object obj) {
            x1.this.a = (Bitmap) obj;
        }

        @Override // defpackage.d5f0
        public final void h(Drawable drawable) {
        }
    }
}
