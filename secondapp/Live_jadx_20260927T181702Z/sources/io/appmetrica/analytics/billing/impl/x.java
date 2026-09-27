package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class x extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile x[] f95076d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f95077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f95078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f95079c;

    public x() {
        a();
    }

    public static x[] b() {
        if (f95076d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95076d == null) {
                        f95076d = new x[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95076d;
    }

    public final x a() {
        this.f95077a = false;
        this.f95078b = null;
        this.f95079c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f95077a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        w wVar = this.f95078b;
        if (wVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        v vVar = this.f95079c;
        return vVar != null ? CodedOutputByteBufferNano.computeMessageSize(3, vVar) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f95077a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        w wVar = this.f95078b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        v vVar = this.f95079c;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(3, vVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f95077a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f95078b == null) {
                    this.f95078b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f95078b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f95079c == null) {
                    this.f95079c = new v();
                }
                codedInputByteBufferNano.readMessage(this.f95079c);
            }
        }
        return this;
    }

    public static x b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new x().mergeFrom(codedInputByteBufferNano);
    }

    public static x a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (x) MessageNano.mergeFrom(new x(), bArr);
    }
}
