package defpackage;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mih extends AsyncTask<a, Void, List<u4w>> {
    public v4w a;
    public int b;

    public static class a {
        public final u4w a;
        public final yl80 b;
        public final v4w c;

        public a(u4w u4wVar, yl80 yl80Var, v4w v4wVar) {
            this.a = u4wVar;
            this.b = yl80Var;
            this.c = v4wVar;
        }
    }

    @Override // android.os.AsyncTask
    public final List<u4w> doInBackground(a[] aVarArr) {
        a aVar = aVarArr[0];
        u4w u4wVar = aVar.a;
        yl80 yl80Var = aVar.b;
        this.a = aVar.c;
        this.b = 7;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(u4wVar.b.a.getTime());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7 && !isCancelled(); i++) {
            calendar.add(2, -1);
            arrayList.add(0, lu5.c(calendar.getTime(), yl80Var));
        }
        return arrayList;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(List<u4w> list) {
        List<u4w> list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        this.a.a.addAll(0, list2);
        this.a.notifyItemRangeInserted(0, this.b);
    }
}
