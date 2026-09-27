package com.bytedance.sdk.component.hu.hww.hu;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu implements hv {
    private Context hww;

    public hu(Context context) {
        this.hww = context;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu.hv
    public List<vy> hww() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorHww = com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(this.hww, "trackurl", null, null, null, null, null, null);
        if (cursorHww != null) {
            while (cursorHww.moveToNext()) {
                try {
                    try {
                        String string = cursorHww.getString(cursorHww.getColumnIndex("id"));
                        String string2 = cursorHww.getString(cursorHww.getColumnIndex("url"));
                        boolean z10 = cursorHww.getInt(cursorHww.getColumnIndex("replaceholder")) > 0;
                        int i10 = cursorHww.getInt(cursorHww.getColumnIndex("retry"));
                        int i11 = cursorHww.getInt(cursorHww.getColumnIndex("url_type"));
                        String string3 = cursorHww.getString(cursorHww.getColumnIndex("ad_id"));
                        String string4 = cursorHww.getString(cursorHww.getColumnIndex("error_code"));
                        String string5 = cursorHww.getString(cursorHww.getColumnIndex("error_msg"));
                        vy vyVar = new vy(string, string2, z10, i11, string3);
                        vyVar.hww(i10);
                        if (!TextUtils.isEmpty(string4)) {
                            vyVar.hww(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            vyVar.tq(string5);
                        }
                        linkedList.add(vyVar);
                    } catch (Throwable unused) {
                        return linkedList;
                    }
                } finally {
                    cursorHww.close();
                }
            }
            cursorHww.close();
            return linkedList;
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu.hv
    public void sd(vy vyVar) {
        com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(this.hww, "trackurl", "id=?", new String[]{vyVar.hww()});
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu.hv
    public void tq(vy vyVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", vyVar.hww());
        contentValues.put("url", vyVar.tq());
        contentValues.put("replaceholder", Integer.valueOf(vyVar.sd() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(vyVar.vy()));
        contentValues.put("error_code", vyVar.vgm());
        contentValues.put("error_msg", vyVar.rs());
        contentValues.put("url_type", Integer.valueOf(vyVar.hv()));
        contentValues.put("ad_id", vyVar.hu());
        com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(this.hww, "trackurl", contentValues, "id=?", new String[]{vyVar.hww()});
    }

    public static String tq() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu.hv
    public vy hww(String str) {
        Cursor cursorHww = com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(this.hww, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorHww != null && cursorHww.moveToFirst()) {
            try {
                String string = cursorHww.getString(cursorHww.getColumnIndex("id"));
                String string2 = cursorHww.getString(cursorHww.getColumnIndex("url"));
                boolean z10 = cursorHww.getInt(cursorHww.getColumnIndex("replaceholder")) > 0;
                int i10 = cursorHww.getInt(cursorHww.getColumnIndex("retry"));
                int i11 = cursorHww.getInt(cursorHww.getColumnIndex("url_type"));
                String string3 = cursorHww.getString(cursorHww.getColumnIndex("ad_id"));
                String string4 = cursorHww.getString(cursorHww.getColumnIndex("error_code"));
                String string5 = cursorHww.getString(cursorHww.getColumnIndex("error_msg"));
                vy vyVar = new vy(string, string2, z10, i11, string3);
                vyVar.hww(i10);
                if (!TextUtils.isEmpty(string4)) {
                    vyVar.hww(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    vyVar.tq(string5);
                }
                cursorHww.close();
                return vyVar;
            } catch (Throwable th2) {
                try {
                    th2.getMessage();
                    cursorHww.close();
                    cursorHww = null;
                } catch (Throwable th3) {
                    cursorHww.close();
                    throw th3;
                }
            }
        }
        if (cursorHww != null) {
            cursorHww.close();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu.hv
    public void hww(vy vyVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", vyVar.hww());
        contentValues.put("url", vyVar.tq());
        contentValues.put("replaceholder", Integer.valueOf(vyVar.sd() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(vyVar.vy()));
        contentValues.put("url_type", Integer.valueOf(vyVar.hv()));
        contentValues.put("ad_id", vyVar.hu());
        contentValues.put("error_code", vyVar.vgm());
        contentValues.put("error_msg", vyVar.rs());
        com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(this.hww, "trackurl", contentValues);
    }
}
