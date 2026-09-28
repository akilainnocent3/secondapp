package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.activities.ResultsSearchActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.prematch.data.LiveEventDataInPreMatch;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gms implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gms(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                tf20.c cVar = ((xms) obj2).b;
                Event event = ((LiveEventDataInPreMatch) obj).getEvent();
                cVar.getClass();
                event.getClass();
                tf20.this.w.b(event);
                break;
            default:
                int i2 = ResultsSearchActivity.e;
                ((ResultsSearchActivity) obj2).z1(false);
                lop.b(((egd0) obj).c, Boolean.FALSE);
                break;
        }
    }
}
