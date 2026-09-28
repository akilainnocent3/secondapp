package defpackage;

import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class q400 extends BaseExpandNode {
    public final String a;
    public final Integer b;
    public final String c;
    public final ArrayList d;

    public q400(String str, Integer num, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
        setExpanded(false);
        this.d = new ArrayList();
    }

    @Override // com.chad.library.adapter.base.entity.node.BaseNode
    public final List<BaseNode> getChildNode() {
        return this.d;
    }
}
