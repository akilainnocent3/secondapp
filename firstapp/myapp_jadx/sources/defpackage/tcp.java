package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tcp {
    @Deprecated
    public tcp() {
    }

    public boolean a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final bcp c() {
        if (this instanceof bcp) {
            return (bcp) this;
        }
        rcp.a(this, "Not a JSON Array: ");
        return null;
    }

    public final xdp d() {
        if (this instanceof xdp) {
            return (xdp) this;
        }
        rcp.a(this, "Not a JSON Object: ");
        return null;
    }

    public String f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            JsonWriter jsonWriter = new JsonWriter(w8e0.b(sb));
            jsonWriter.setStrictness(d9e0.a);
            TypeAdapters.z.getClass();
            ddp.c(this, jsonWriter);
            return sb.toString();
        } catch (IOException e) {
            jb5.a(e);
            return null;
        }
    }

    public final cep e() {
        if (this instanceof cep) {
            return (cep) this;
        }
        rcp.a(this, lobGSRIlnSGJY.tkylMgcnOmzCv);
        return null;
    }
}
