package defpackage;

import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class t5h0 extends BaseExpandNode {
    public final ResourceUiText a;
    public final boolean b;
    public final ArrayList c;

    public t5h0(ResourceUiText resourceUiText, boolean z) {
        this.a = resourceUiText;
        this.b = z;
        setExpanded(false);
        this.c = new ArrayList();
    }

    @Override // com.chad.library.adapter.base.entity.node.BaseNode
    public final List<BaseNode> getChildNode() {
        return this.c;
    }
}
