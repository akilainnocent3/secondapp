package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import java.util.ArrayList;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class t38 {
    public static final /* synthetic */ int a = 0;

    public static final ArrayList a(ArrayList arrayList, StringUiText stringUiText) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            p48.w(i > 0 ? b.k(stringUiText, obj) : a.c(obj), arrayList2);
            i = i3;
        }
        return arrayList2;
    }
}
