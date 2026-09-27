package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@k
public final class r extends q<GeneratedMessageLite.b> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.q
    public int extensionNumber(Map.Entry<?, ?> extension) {
        return ((GeneratedMessageLite.b) extension.getKey()).getNumber();
    }

    @Override // com.google.protobuf.q
    public Object findExtensionByNumber(ExtensionRegistryLite extensionRegistry, MessageLite defaultInstance, int number) {
        return extensionRegistry.findLiteExtensionByNumber(defaultInstance, number);
    }

    @Override // com.google.protobuf.q
    public FieldSet<GeneratedMessageLite.b> getExtensions(Object message) {
        return ((GeneratedMessageLite.ExtendableMessage) message).extensions;
    }

    @Override // com.google.protobuf.q
    public FieldSet<GeneratedMessageLite.b> getMutableExtensions(Object message) {
        return ((GeneratedMessageLite.ExtendableMessage) message).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.q
    public boolean hasExtensions(MessageLite prototype) {
        return prototype instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.q
    public void makeImmutable(Object message) {
        getExtensions(message).makeImmutable();
    }

    @Override // com.google.protobuf.q
    public <UT, UB> UB parseExtension(Object obj, z0 z0Var, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet, UB ub2, g1<UT, UB> g1Var) throws IOException {
        Object objValueOf;
        Object field;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    z0Var.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    z0Var.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    z0Var.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    z0Var.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    z0Var.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    z0Var.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    z0Var.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    z0Var.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    z0Var.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    z0Var.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    z0Var.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    z0Var.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    z0Var.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    z0Var.readEnumList(arrayList);
                    ub2 = (UB) d1.filterUnknownEnumList(obj, number, arrayList, generatedExtension.descriptor.getEnumType(), ub2, g1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
            fieldSet.setField(generatedExtension.descriptor, arrayList);
            return ub2;
        }
        if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
            switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(z0Var.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(z0Var.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(z0Var.readInt64());
                    break;
                case 4:
                    objValueOf = Long.valueOf(z0Var.readUInt64());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(z0Var.readInt32());
                    break;
                case 6:
                    objValueOf = Long.valueOf(z0Var.readFixed64());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(z0Var.readFixed32());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(z0Var.readBool());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(z0Var.readUInt32());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(z0Var.readSFixed32());
                    break;
                case 11:
                    objValueOf = Long.valueOf(z0Var.readSFixed64());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(z0Var.readSInt32());
                    break;
                case 13:
                    objValueOf = Long.valueOf(z0Var.readSInt64());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = z0Var.readBytes();
                    break;
                case 16:
                    objValueOf = z0Var.readString();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        Object field2 = fieldSet.getField(generatedExtension.descriptor);
                        if (field2 instanceof GeneratedMessageLite) {
                            b1 b1VarSchemaFor = w0.getInstance().schemaFor(field2);
                            if (!((GeneratedMessageLite) field2).isMutable()) {
                                Object objNewInstance = b1VarSchemaFor.newInstance();
                                b1VarSchemaFor.mergeFrom(objNewInstance, field2);
                                fieldSet.setField(generatedExtension.descriptor, objNewInstance);
                                field2 = objNewInstance;
                            }
                            z0Var.mergeGroupField(field2, b1VarSchemaFor, extensionRegistryLite);
                            return ub2;
                        }
                    }
                    objValueOf = z0Var.readGroup(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        Object field3 = fieldSet.getField(generatedExtension.descriptor);
                        if (field3 instanceof GeneratedMessageLite) {
                            b1 b1VarSchemaFor2 = w0.getInstance().schemaFor(field3);
                            if (!((GeneratedMessageLite) field3).isMutable()) {
                                Object objNewInstance2 = b1VarSchemaFor2.newInstance();
                                b1VarSchemaFor2.mergeFrom(objNewInstance2, field3);
                                fieldSet.setField(generatedExtension.descriptor, objNewInstance2);
                                field3 = objNewInstance2;
                            }
                            z0Var.mergeMessageField(field3, b1VarSchemaFor2, extensionRegistryLite);
                            return ub2;
                        }
                    }
                    objValueOf = z0Var.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int int32 = z0Var.readInt32();
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(int32) == null) {
                return (UB) d1.storeUnknownEnum(obj, number, int32, ub2, g1Var);
            }
            objValueOf = Integer.valueOf(int32);
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.addRepeatedField(generatedExtension.descriptor, objValueOf);
            return ub2;
        }
        int i10 = a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()];
        if ((i10 == 17 || i10 == 18) && (field = fieldSet.getField(generatedExtension.descriptor)) != null) {
            objValueOf = Internal.mergeMessage(field, objValueOf);
        }
        fieldSet.setField(generatedExtension.descriptor, objValueOf);
        return ub2;
    }

    @Override // com.google.protobuf.q
    public void parseLengthPrefixedMessageSetItem(z0 reader, Object extensionObject, ExtensionRegistryLite extensionRegistry, FieldSet<GeneratedMessageLite.b> extensions) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) extensionObject;
        extensions.setField(generatedExtension.descriptor, reader.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistry));
    }

    @Override // com.google.protobuf.q
    public void parseMessageSetItem(ByteString data, Object extensionObject, ExtensionRegistryLite extensionRegistry, FieldSet<GeneratedMessageLite.b> extensions) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) extensionObject;
        MessageLite.Builder builderNewBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        CodedInputStream codedInputStreamNewCodedInput = data.newCodedInput();
        builderNewBuilderForType.mergeFrom(codedInputStreamNewCodedInput, extensionRegistry);
        extensions.setField(generatedExtension.descriptor, builderNewBuilderForType.buildPartial());
        codedInputStreamNewCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.q
    public void serializeExtension(Writer writer, Map.Entry<?, ?> extension) throws IOException {
        GeneratedMessageLite.b bVar = (GeneratedMessageLite.b) extension.getKey();
        if (!bVar.isRepeated()) {
            switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.getLiteType().ordinal()]) {
                case 1:
                    writer.writeDouble(bVar.getNumber(), ((Double) extension.getValue()).doubleValue());
                    break;
                case 2:
                    writer.writeFloat(bVar.getNumber(), ((Float) extension.getValue()).floatValue());
                    break;
                case 3:
                    writer.writeInt64(bVar.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 4:
                    writer.writeUInt64(bVar.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 5:
                    writer.writeInt32(bVar.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 6:
                    writer.writeFixed64(bVar.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 7:
                    writer.writeFixed32(bVar.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 8:
                    writer.writeBool(bVar.getNumber(), ((Boolean) extension.getValue()).booleanValue());
                    break;
                case 9:
                    writer.writeUInt32(bVar.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 10:
                    writer.writeSFixed32(bVar.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 11:
                    writer.writeSFixed64(bVar.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 12:
                    writer.writeSInt32(bVar.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 13:
                    writer.writeSInt64(bVar.getNumber(), ((Long) extension.getValue()).longValue());
                    break;
                case 14:
                    writer.writeInt32(bVar.getNumber(), ((Integer) extension.getValue()).intValue());
                    break;
                case 15:
                    writer.writeBytes(bVar.getNumber(), (ByteString) extension.getValue());
                    break;
                case 16:
                    writer.writeString(bVar.getNumber(), (String) extension.getValue());
                    break;
                case 17:
                    writer.writeGroup(bVar.getNumber(), extension.getValue(), w0.getInstance().schemaFor((Class) extension.getValue().getClass()));
                    break;
                case 18:
                    writer.writeMessage(bVar.getNumber(), extension.getValue(), w0.getInstance().schemaFor((Class) extension.getValue().getClass()));
                    break;
            }
        }
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.getLiteType().ordinal()]) {
            case 1:
                d1.writeDoubleList(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 2:
                d1.writeFloatList(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 3:
                d1.writeInt64List(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 4:
                d1.writeUInt64List(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 5:
                d1.writeInt32List(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 6:
                d1.writeFixed64List(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 7:
                d1.writeFixed32List(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 8:
                d1.writeBoolList(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 9:
                d1.writeUInt32List(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 10:
                d1.writeSFixed32List(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 11:
                d1.writeSFixed64List(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 12:
                d1.writeSInt32List(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 13:
                d1.writeSInt64List(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 14:
                d1.writeInt32List(bVar.getNumber(), (List) extension.getValue(), writer, bVar.isPacked());
                break;
            case 15:
                d1.writeBytesList(bVar.getNumber(), (List) extension.getValue(), writer);
                break;
            case 16:
                d1.writeStringList(bVar.getNumber(), (List) extension.getValue(), writer);
                break;
            case 17:
                List list = (List) extension.getValue();
                if (list != null && !list.isEmpty()) {
                    d1.writeGroupList(bVar.getNumber(), (List) extension.getValue(), writer, w0.getInstance().schemaFor((Class) list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) extension.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    d1.writeMessageList(bVar.getNumber(), (List) extension.getValue(), writer, w0.getInstance().schemaFor((Class) list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // com.google.protobuf.q
    public void setExtensions(Object message, FieldSet<GeneratedMessageLite.b> extensions) {
        ((GeneratedMessageLite.ExtendableMessage) message).extensions = extensions;
    }
}
