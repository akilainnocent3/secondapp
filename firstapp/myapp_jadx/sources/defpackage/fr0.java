package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class fr0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        rza.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                aVar = new rza.a(clipData, 3);
            } else {
                rza.c cVar = new rza.c();
                cVar.a = clipData;
                cVar.b = 3;
                aVar = cVar;
            }
            r6i0.l(textView, aVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        rza.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new rza.a(clipData, 3);
        } else {
            rza.c cVar = new rza.c();
            cVar.a = clipData;
            cVar.b = 3;
            aVar = cVar;
        }
        r6i0.l(view, aVar.build());
        return true;
    }
}
