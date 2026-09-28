package defpackage;

import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class f4z extends BaseExpandNode {
    public final ResourceUiText a;
    public final ArrayList b;

    public f4z(ResourceUiText resourceUiText) {
        this.a = resourceUiText;
        setExpanded(false);
        this.b = new ArrayList();
    }

    @Override // com.chad.library.adapter.base.entity.node.BaseNode
    public final List<BaseNode> getChildNode() {
        return this.b;
    }
}
