package defpackage;

import com.chad.library.adapter.base.entity.node.BaseNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class crg extends BaseNode {
    public String a;
    public ArrayList b;
    public ArrayList c;
    public int d;
    public int e;
    public int f;
    public u4v g;

    public final void a(int i, String str) {
        ArrayList arrayList = this.c;
        if (str.equals("near")) {
            this.d = this.e;
            return;
        }
        if (str.equals("far")) {
            this.d = this.f;
            return;
        }
        int i2 = i - 2;
        if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        if (((String) arrayList.get(i2)).equals(str)) {
            this.d = i2;
            return;
        }
        int iIndexOf = arrayList.indexOf(str);
        if (iIndexOf != -1) {
            this.d = iIndexOf;
        }
    }

    @Override // com.chad.library.adapter.base.entity.node.BaseNode
    public final List<BaseNode> getChildNode() {
        return null;
    }
}
