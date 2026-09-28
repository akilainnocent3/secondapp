package com.chad.library.adapter.base.viewholder;

import android.view.View;
import com.sportybet.android.gp.tz.R;
import defpackage.d7i0;
import defpackage.hb5;
import defpackage.loc;
import defpackage.moc;
import defpackage.wga;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;", "Ld7i0;", "BD", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "dataBinding", "Ld7i0;", "getDataBinding", "()Ld7i0;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class BaseDataBindingHolder<BD extends d7i0> extends BaseViewHolder {
    private final BD dataBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDataBindingHolder(View view) {
        super(view);
        view.getClass();
        loc locVar = moc.a;
        int i = d7i0.a;
        BD bd = (BD) view.getTag(R.id.dataBinding);
        if (bd == null) {
            Object tag = view.getTag();
            if (!(tag instanceof String)) {
                hb5.a("View is not a binding layout");
                throw null;
            }
            loc locVar2 = moc.a;
            int iB = locVar2.b((String) tag);
            if (iB == 0) {
                hb5.a(wga.a(tag, "View is not a binding layout. Tag: "));
                throw null;
            }
            bd = (BD) locVar2.a(iB, view);
        }
        this.dataBinding = bd;
    }

    public final BD getDataBinding() {
        return this.dataBinding;
    }
}
