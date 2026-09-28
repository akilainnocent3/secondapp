package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zug {
    public static String a(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static void b(StringBuilder sb, String str, TextView textView) {
        sb.append(str);
        textView.setText(sb.toString());
    }
}
