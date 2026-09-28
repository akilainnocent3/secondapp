package com.sportybet.plugin.realsports.event.comment;

import android.view.View;
import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements View.OnClickListener {
    public final /* synthetic */ ReplyPanel.b a;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReplyPanel.b bVar = c.this.a;
            bVar.d.setMaxLines(Reader.READ_DONE);
            bVar.c.setVisibility(8);
        }
    }

    public c(ReplyPanel.b bVar) {
        this.a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.post(new a());
    }
}
