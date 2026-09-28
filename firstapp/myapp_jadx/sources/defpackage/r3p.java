package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class r3p implements fpy {
    public Event a;
    public int b;
    public final /* synthetic */ RegularMarketRule c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;
    public final /* synthetic */ s3p f;

    public r3p(s3p s3pVar, RegularMarketRule regularMarketRule, ArrayList arrayList, int i) {
        this.f = s3pVar;
        this.c = regularMarketRule;
        this.d = arrayList;
        this.e = i;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.b != i) {
            this.a.setSelectSpecifier(this.c.a, (String) this.d.get(i));
            djs.b bVar = this.f.a;
            djs.this.notifyItemChanged(this.e);
        }
    }
}
