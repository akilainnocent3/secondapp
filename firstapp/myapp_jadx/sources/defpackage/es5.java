package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class es5 {
    public final HashMap<String, ds5> a = new HashMap<>();
    public final SparseArray<String> b = new SparseArray<>();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final c e;
    public c f;

    public static final class a implements c {
        public static final String[] e = {AnalyticsParam.EVENT_PARAM_ID, "key", "metadata"};
        public final kvd0 a;
        public final SparseArray<ds5> b = new SparseArray<>();
        public String c;
        public String d;

        public a(kvd0 kvd0Var) {
            this.a = kvd0Var;
        }

        @Override // es5.c
        public final void a(ds5 ds5Var) {
            this.b.put(ds5Var.a, ds5Var);
        }

        @Override // es5.c
        public final boolean b() throws fsc {
            try {
                SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
                String str = this.c;
                str.getClass();
                return d2i0.a(readableDatabase, 1, str) != -1;
            } catch (SQLException e2) {
                throw new fsc(e2);
            }
        }

        @Override // es5.c
        public final void c(HashMap<String, ds5> map) throws fsc {
            SparseArray<ds5> sparseArray = this.b;
            if (sparseArray.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < sparseArray.size(); i++) {
                    try {
                        ds5 ds5VarValueAt = sparseArray.valueAt(i);
                        if (ds5VarValueAt == null) {
                            int iKeyAt = sparseArray.keyAt(i);
                            String str = this.d;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                        } else {
                            i(writableDatabase, ds5VarValueAt);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new fsc(e2);
            }
        }

        @Override // es5.c
        public final void d(long j) {
            String hexString = Long.toHexString(j);
            this.c = hexString;
            this.d = inm.a("ExoPlayerCacheIndex", hexString);
        }

        @Override // es5.c
        public final void e(HashMap<String, ds5> map) throws fsc {
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    j(writableDatabase);
                    Iterator<ds5> it = map.values().iterator();
                    while (it.hasNext()) {
                        i(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new fsc(e2);
            }
        }

        @Override // es5.c
        public final void f(ds5 ds5Var, boolean z) {
            int i = ds5Var.a;
            SparseArray<ds5> sparseArray = this.b;
            if (z) {
                sparseArray.delete(i);
            } else {
                sparseArray.put(i, null);
            }
        }

        @Override // es5.c
        public final void g(HashMap<String, ds5> map, SparseArray<String> sparseArray) throws fsc {
            kvd0 kvd0Var = this.a;
            ly0.f(this.b.size() == 0);
            try {
                SQLiteDatabase readableDatabase = kvd0Var.getReadableDatabase();
                String str = this.c;
                str.getClass();
                if (d2i0.a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = kvd0Var.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        j(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                SQLiteDatabase readableDatabase2 = kvd0Var.getReadableDatabase();
                String str2 = this.d;
                str2.getClass();
                Cursor cursorQuery = readableDatabase2.query(str2, e, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        int i = cursorQuery.getInt(0);
                        String string = cursorQuery.getString(1);
                        string.getClass();
                        map.put(string, new ds5(i, string, es5.e(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                        sparseArray.put(i, string);
                    } catch (Throwable th2) {
                        if (cursorQuery == null) {
                            throw th2;
                        }
                        try {
                            cursorQuery.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
                cursorQuery.close();
            } catch (SQLiteException e2) {
                map.clear();
                sparseArray.clear();
                throw new fsc(e2);
            }
        }

        @Override // es5.c
        public final void h() throws fsc {
            kvd0 kvd0Var = this.a;
            String str = this.c;
            str.getClass();
            try {
                String strConcat = "ExoPlayerCacheIndex".concat(str);
                SQLiteDatabase writableDatabase = kvd0Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    int i = d2i0.a;
                    try {
                        String str2 = jrh0.a;
                        if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                            writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(strConcat));
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (SQLException e2) {
                        throw new fsc(e2);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e3) {
                throw new fsc(e3);
            }
        }

        public final void i(SQLiteDatabase sQLiteDatabase, ds5 ds5Var) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            es5.g(ds5Var.e, new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put(AnalyticsParam.EVENT_PARAM_ID, Integer.valueOf(ds5Var.a));
            contentValues.put("key", ds5Var.b);
            contentValues.put("metadata", byteArray);
            String str = this.d;
            str.getClass();
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        public final void j(SQLiteDatabase sQLiteDatabase) throws fsc {
            String str = this.c;
            str.getClass();
            d2i0.b(sQLiteDatabase, 1, str);
            String str2 = this.d;
            str2.getClass();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    public interface c {
        void a(ds5 ds5Var);

        boolean b();

        void c(HashMap<String, ds5> map);

        void d(long j);

        void e(HashMap<String, ds5> map);

        void f(ds5 ds5Var, boolean z);

        void g(HashMap<String, ds5> map, SparseArray<String> sparseArray);

        void h();
    }

    public es5(kvd0 kvd0Var, File file) {
        a aVar = new a(kvd0Var);
        b bVar = new b(new File(file, "cached_content_index.exi"));
        this.e = aVar;
        this.f = bVar;
    }

    public static mbd e(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                i08.a(hce0.a(i3, "Invalid value size: "));
                return null;
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = jrh0.b;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new mbd(map);
    }

    public static void g(mbd mbdVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setEntrySet = mbdVar.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public final ds5 a(String str) {
        return this.a.get(str);
    }

    public final ds5 b(String str) {
        HashMap<String, ds5> map = this.a;
        ds5 ds5Var = map.get(str);
        if (ds5Var != null) {
            return ds5Var;
        }
        SparseArray<String> sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        ds5 ds5Var2 = new ds5(iKeyAt, str, mbd.c);
        map.put(str, ds5Var2);
        sparseArray.put(iKeyAt, str);
        this.d.put(iKeyAt, true);
        this.e.a(ds5Var2);
        return ds5Var2;
    }

    public final void c(long j) {
        c cVar;
        c cVar2 = this.e;
        cVar2.d(j);
        c cVar3 = this.f;
        if (cVar3 != null) {
            cVar3.d(j);
        }
        boolean zB = cVar2.b();
        SparseArray<String> sparseArray = this.b;
        HashMap<String, ds5> map = this.a;
        if (zB || (cVar = this.f) == null || !cVar.b()) {
            cVar2.g(map, sparseArray);
        } else {
            this.f.g(map, sparseArray);
            cVar2.e(map);
        }
        c cVar4 = this.f;
        if (cVar4 != null) {
            cVar4.h();
            this.f = null;
        }
    }

    public final void d(String str) {
        HashMap<String, ds5> map = this.a;
        ds5 ds5Var = map.get(str);
        if (ds5Var != null && ds5Var.c.isEmpty() && ds5Var.d.isEmpty()) {
            map.remove(str);
            int i = ds5Var.a;
            SparseBooleanArray sparseBooleanArray = this.d;
            boolean z = sparseBooleanArray.get(i);
            this.e.f(ds5Var, z);
            SparseArray<String> sparseArray = this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.c.put(i, true);
            }
        }
    }

    public final void f() {
        this.e.c(this.a);
        SparseBooleanArray sparseBooleanArray = this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.d.clear();
    }

    public static class b implements c {
        public final Cipher a = null;
        public final SecretKeySpec b = null;
        public final r11 c;
        public boolean d;
        public lo50 e;

        public b(File file) {
            this.c = new r11(file);
        }

        public static int i(ds5 ds5Var, int i) {
            int iHashCode = ds5Var.b.hashCode() + (ds5Var.a * 31);
            mbd mbdVar = ds5Var.e;
            if (i < 2) {
                long jA = xza.a(mbdVar);
                return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
            }
            return mbdVar.hashCode() + (iHashCode * 31);
        }

        public static ds5 j(int i, DataInputStream dataInputStream) throws IOException {
            mbd mbdVarE;
            int i2 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i < 2) {
                long j = dataInputStream.readLong();
                yza yzaVar = new yza();
                yzaVar.a(Long.valueOf(j), "exo_len");
                mbdVarE = mbd.c.b(yzaVar);
            } else {
                mbdVarE = es5.e(dataInputStream);
            }
            return new ds5(i2, utf, mbdVarE);
        }

        @Override // es5.c
        public final void a(ds5 ds5Var) {
            this.d = true;
        }

        @Override // es5.c
        public final boolean b() {
            r11 r11Var = this.c;
            return r11Var.a.exists() || r11Var.b.exists();
        }

        @Override // es5.c
        public final void c(HashMap<String, ds5> map) throws Throwable {
            if (this.d) {
                e(map);
            }
        }

        @Override // es5.c
        public final void e(HashMap<String, ds5> map) throws Throwable {
            r11 r11Var = this.c;
            DataOutputStream dataOutputStream = null;
            try {
                r11.a aVarA = r11Var.a();
                lo50 lo50Var = this.e;
                if (lo50Var == null) {
                    this.e = new lo50(aVarA);
                } else {
                    lo50Var.d(aVarA);
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(this.e);
                try {
                    dataOutputStream2.writeInt(2);
                    dataOutputStream2.writeInt(0);
                    dataOutputStream2.writeInt(map.size());
                    int i = 0;
                    for (ds5 ds5Var : map.values()) {
                        dataOutputStream2.writeInt(ds5Var.a);
                        dataOutputStream2.writeUTF(ds5Var.b);
                        es5.g(ds5Var.e, dataOutputStream2);
                        i += i(ds5Var, 2);
                    }
                    dataOutputStream2.writeInt(i);
                    dataOutputStream2.close();
                    r11Var.b.delete();
                    String str = jrh0.a;
                    this.d = false;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    jrh0.g(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // es5.c
        public final void f(ds5 ds5Var, boolean z) {
            this.d = true;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x004e  */
        @Override // es5.c
        public final void g(HashMap<String, ds5> map, SparseArray<String> sparseArray) throws Throwable {
            DataInputStream dataInputStream;
            ly0.f(!this.d);
            r11 r11Var = this.c;
            File file = r11Var.a;
            File file2 = r11Var.a;
            File file3 = r11Var.b;
            if (file.exists() || file3.exists()) {
                DataInputStream dataInputStream2 = null;
                try {
                    if (file3.exists()) {
                        file2.delete();
                        file3.renameTo(file2);
                    }
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                    DataInputStream dataInputStream3 = new DataInputStream(bufferedInputStream);
                    try {
                        int i = dataInputStream3.readInt();
                        if (i < 0 || i > 2) {
                            jrh0.g(dataInputStream3);
                        } else {
                            if ((dataInputStream3.readInt() & 1) != 0) {
                                Cipher cipher = this.a;
                                if (cipher == null) {
                                    jrh0.g(dataInputStream3);
                                } else {
                                    byte[] bArr = new byte[16];
                                    dataInputStream3.readFully(bArr);
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                    try {
                                        SecretKeySpec secretKeySpec = this.b;
                                        String str = jrh0.a;
                                        cipher.init(2, secretKeySpec, ivParameterSpec);
                                        dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                    } catch (InvalidAlgorithmParameterException e) {
                                        e = e;
                                        throw new IllegalStateException(e);
                                    } catch (InvalidKeyException e2) {
                                        e = e2;
                                        throw new IllegalStateException(e);
                                    }
                                }
                            } else {
                                dataInputStream = dataInputStream3;
                            }
                            try {
                                int i2 = dataInputStream.readInt();
                                int i3 = 0;
                                for (int i4 = 0; i4 < i2; i4++) {
                                    ds5 ds5VarJ = j(i, dataInputStream);
                                    String str2 = ds5VarJ.b;
                                    map.put(str2, ds5VarJ);
                                    sparseArray.put(ds5VarJ.a, str2);
                                    i3 += i(ds5VarJ, i);
                                }
                                int i5 = dataInputStream.readInt();
                                boolean z = dataInputStream.read() == -1;
                                if (i5 == i3 && z) {
                                    jrh0.g(dataInputStream);
                                    return;
                                }
                                jrh0.g(dataInputStream);
                            } catch (IOException unused) {
                                dataInputStream2 = dataInputStream;
                                if (dataInputStream2 != null) {
                                    jrh0.g(dataInputStream2);
                                }
                            } catch (Throwable th) {
                                dataInputStream2 = dataInputStream;
                                th = th;
                                if (dataInputStream2 != null) {
                                    jrh0.g(dataInputStream2);
                                }
                                throw th;
                            }
                        }
                    } catch (IOException unused2) {
                        dataInputStream2 = dataInputStream3;
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream2 = dataInputStream3;
                    }
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    th = th3;
                }
                map.clear();
                sparseArray.clear();
                file2.delete();
                file3.delete();
            }
        }

        @Override // es5.c
        public final void h() {
            r11 r11Var = this.c;
            r11Var.a.delete();
            r11Var.b.delete();
        }

        @Override // es5.c
        public final void d(long j) {
        }
    }
}
