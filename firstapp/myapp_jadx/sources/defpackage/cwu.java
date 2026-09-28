package defpackage;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.b;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.search.SearchFragment;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cwu implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cwu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bi6 bi6Var = ((gwu) obj).b;
                if (bi6Var != null) {
                    bi6Var.a.d.f();
                }
                break;
            default:
                final SearchFragment searchFragment = (SearchFragment) obj;
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                b.a aVar = new b.a(searchFragment.requireContext());
                aVar.d(R.string.wap_search__delete_confirm_title);
                aVar.a(R.string.wap_search__delete_confirm_content);
                aVar.setNegativeButton(R.string.common_functions__cancel, null).setPositiveButton(R.string.common_feedback__delete, new DialogInterface.OnClickListener() { // from class: tu70
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ohp<Object>[] ohpVarArr2 = SearchFragment.V;
                        searchFragment.s0().y1(null);
                    }
                }).f();
                break;
        }
    }
}
