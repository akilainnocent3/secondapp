package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class jvo {
    public final Context a;
    public boolean b;
    public int c;
    public int d;
    public ArrayList e;
    public TextView f;

    public jvo(Context context) {
        context.getClass();
        this.a = context;
        this.e = new ArrayList();
    }

    public final void a(LinkedHashMap linkedHashMap) {
        boolean z = this.b;
        ArrayList arrayList = this.e;
        if (z) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((View) obj).setVisibility(0);
            }
        } else {
            int size2 = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                int i4 = i2 + 1;
                if (i2 < 0) {
                    b.q();
                    throw null;
                }
                View view = (View) obj2;
                if (i2 < this.d || i2 < 3) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (((View) entry.getValue()).hashCode() == view.hashCode()) {
                            ((View) entry.getKey()).setVisibility(8);
                        }
                    }
                }
                i2 = i4;
            }
        }
        if (this.b) {
            TextView textView = this.f;
            if (textView != null) {
                textView.setVisibility(4);
                return;
            }
            return;
        }
        if (this.d >= this.e.size() || 3 >= this.e.size()) {
            TextView textView2 = this.f;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
    }
}
