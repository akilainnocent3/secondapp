package defpackage;

import android.os.Build;
import android.os.Bundle;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneConfig;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class bs20 {
    public static final a a = new a(false);

    public static final class a extends djx<PrimaryPhoneConfig> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            return Build.VERSION.SDK_INT >= 33 ? (PrimaryPhoneConfig) bundle.getParcelable(str, PrimaryPhoneConfig.class) : (PrimaryPhoneConfig) bundle.getParcelable(str);
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final PrimaryPhoneConfig h(String str) {
            str.getClass();
            Object objFromJson = sh8.b().fromJson(str, (Class<Object>) PrimaryPhoneConfig.class);
            objFromJson.getClass();
            return (PrimaryPhoneConfig) objFromJson;
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, PrimaryPhoneConfig primaryPhoneConfig) {
            PrimaryPhoneConfig primaryPhoneConfig2 = primaryPhoneConfig;
            str.getClass();
            primaryPhoneConfig2.getClass();
            bundle.putParcelable(str, primaryPhoneConfig2);
        }
    }

    public static void a(yfx yfxVar) {
        zix zixVarA = bjx.a(new r8a(1, new kkx()));
        yfxVar.getClass();
        yfx.i(yfxVar, "primary_phone_updated_successfully_route", zixVarA, 4);
    }

    public static void b(yfx yfxVar, String str, String str2) {
        List listSplit$default;
        String[] strArr;
        zix zixVarA = bjx.a(new r8a(1, new kkx()));
        yfxVar.getClass();
        yfx.i(yfxVar, lx5.a("primary_phone_update_phone_number_route/", (str2 == null || (listSplit$default = StringsKt__StringsKt.split$default(str2, new String[]{"/"}, false, 0, 6, null)) == null || (strArr = (String[]) listSplit$default.toArray(new String[0])) == null) ? null : ay0.G(strArr, ",", null, null, null, 62), "/", str), zixVarA, 4);
    }
}
