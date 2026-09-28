package defpackage;

import android.os.Parcel;
import androidx.compose.ui.platform.ComposeView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f78 {
    public static String a(ComposeView composeView, int i, String str, HashMap map) {
        String string = composeView.getContext().getString(i);
        string.getClass();
        return op5.b(str, string, map);
    }

    public static void b(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void c(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }
}
