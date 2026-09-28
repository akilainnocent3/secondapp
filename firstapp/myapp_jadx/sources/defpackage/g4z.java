package defpackage;

import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class g4z extends BaseExpandNode {
    public final String a;
    public final ResourceUiText b;
    public final ArrayList c;

    public g4z(ResourceUiText resourceUiText, String str) {
        this.a = str;
        this.b = resourceUiText;
        setExpanded(false);
        this.c = new ArrayList();
    }

    @Override // com.chad.library.adapter.base.entity.node.BaseNode
    public final List<BaseNode> getChildNode() {
        return this.c;
    }
}
