package gr;

import fr.g0;
import fr.h0;
import fr.x1;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
public final class h implements Externalizable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public static final a f87349d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f87350e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f87351f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f87352g = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public Collection<?> f87353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87354c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }
    }

    public h(@l Collection<?> collection, int i10) {
        m0.p(collection, "collection");
        this.f87353b = collection;
        this.f87354c = i10;
    }

    public final Object d() {
        return this.f87353b;
    }

    @Override // java.io.Externalizable
    public void readExternal(@l ObjectInput input) throws IOException {
        List listB;
        m0.p(input, "input");
        byte b10 = input.readByte();
        int i10 = b10 & 1;
        if ((b10 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10) + kj.e.f102543c);
        }
        int i11 = input.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i11 + kj.e.f102543c);
        }
        int i12 = 0;
        if (i10 == 0) {
            List listK = g0.k(i11);
            while (i12 < i11) {
                listK.add(input.readObject());
                i12++;
            }
            listB = g0.b(listK);
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i10 + kj.e.f102543c);
            }
            Set setE = x1.e(i11);
            while (i12 < i11) {
                setE.add(input.readObject());
                i12++;
            }
            listB = x1.a(setE);
        }
        this.f87353b = listB;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@l ObjectOutput output) throws IOException {
        m0.p(output, "output");
        output.writeByte(this.f87354c);
        output.writeInt(this.f87353b.size());
        Iterator<?> it = this.f87353b.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public h() {
        this(h0.J(), 0);
    }
}
