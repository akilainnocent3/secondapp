package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.country.ChangeRegionActivity;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ps40 extends RecyclerView.f<a> {
    public final Context a;
    public final List<x7b.a> b;
    public final o57 c;
    public final List<x7b.a> d;

    public static final class a extends RecyclerView.d0 {
        public final TextView a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            view.getClass();
            View viewFindViewById = view.findViewById(R.id.text_region);
            viewFindViewById.getClass();
            this.a = (TextView) viewFindViewById;
        }
    }

    public ps40(Context context, List list, o57 o57Var) {
        list.getClass();
        this.a = context;
        this.b = list;
        this.c = o57Var;
        this.d = list;
        zch0.b(context.getResources(), 23);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        final x7b.a aVar2 = this.d.get(i);
        TextView textView = aVar.a;
        textView.setText(aVar2.d);
        int i2 = aVar2.c;
        Context context = this.a;
        textView.setCompoundDrawablesWithIntrinsicBounds(gr0.a(context, i2), (Drawable) null, aVar2.b ? gr0.a(context, R.drawable.ic_check_black_24dp) : null, (Drawable) null);
        textView.setOnClickListener(new View.OnClickListener() { // from class: os40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o57 o57Var = this.a.c;
                if (o57Var != null) {
                    x7b.a aVar3 = aVar2;
                    boolean z = aVar3.b;
                    CountryCodeName countryCodeName = aVar3.a;
                    if (z) {
                        return;
                    }
                    ChangeRegionActivity changeRegionActivity = o57Var.a;
                    int i3 = ChangeRegionActivity.e;
                    if (changeRegionActivity.c) {
                        return;
                    }
                    changeRegionActivity.c = true;
                    ProgressDialog progressDialog = new ProgressDialog(changeRegionActivity, R.style.BrandProgressDialogTheme);
                    progressDialog.setMessage(changeRegionActivity.getCMSString(R.string.common_functions__loading_with_dot, new Object[0]));
                    progressDialog.setIndeterminate(true);
                    progressDialog.setCancelable(false);
                    progressDialog.setCanceledOnTouchOutside(false);
                    progressDialog.show();
                    itf0.a aVar4 = itf0.a;
                    aVar4.q(MyLog.TAG_REGION);
                    aVar4.a("ChangeRegionActivity: change to %s", countryCodeName);
                    s57 s57Var = changeRegionActivity.b;
                    s57Var.getClass();
                    countryCodeName.getClass();
                    ej5.c(o8i0.d(s57Var), null, null, new t57(s57Var, countryCodeName, null), 3);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.region_item, viewGroup, false);
        viewInflate.getClass();
        return new a(viewInflate);
    }
}
