package defpackage;

import android.widget.TextView;
import com.sportygames.spin2win.model.local.LocalGameDetailsEntity;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kya0 {
    public static void a(LocalGameDetailsEntity localGameDetailsEntity, TextView textView) {
        textView.setText(String.valueOf(localGameDetailsEntity.getLocalizedTitle()));
    }

    public static void b(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
    }
}
