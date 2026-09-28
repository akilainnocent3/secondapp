package defpackage;

import android.view.View;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class q3z extends BaseNode {
    public final j7g a;
    public final boolean b;
    public final UiText c;
    public final View.OnClickListener d;
    public final int e;
    public final boolean f;

    public q3z(j7g j7gVar, ResourceUiText resourceUiText, View.OnClickListener onClickListener, int i) {
        boolean z = (i & 2) == 0;
        resourceUiText = (i & 4) != 0 ? null : resourceUiText;
        onClickListener = (i & 16) != 0 ? null : onClickListener;
        boolean z2 = (i & 64) == 0;
        this.a = j7gVar;
        this.b = z;
        this.c = resourceUiText;
        this.d = onClickListener;
        this.e = R.color.brand_secondary;
        this.f = z2;
    }

    @Override // com.chad.library.adapter.base.entity.node.BaseNode
    public final List<BaseNode> getChildNode() {
        return null;
    }
}
