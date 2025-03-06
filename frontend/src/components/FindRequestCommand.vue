<template>
    <v-card outlined>
        <v-card-title>
            FindRequest
        </v-card-title>

        <v-card-text>
            <Number label="Id" v-model="value.id" :editMode="editMode"/>
            <String label="UserId" v-model="value.userId" :editMode="editMode"/>
            <String label="Imei" v-model="value.imei" :editMode="editMode"/>
            <String label="Gps" v-model="value.gps" :editMode="editMode"/>
            <String label="LockState" v-model="value.lockState" :editMode="editMode"/>
            <String label="Status" v-model="value.status" :editMode="editMode"/>
            <Date label="LostAt" v-model="value.lostAt" :editMode="editMode"/>
            <String label="TmpPhoneImei" v-model="value.tmpPhoneImei" :editMode="editMode"/>
            <String label="TmpPhoneStatus" v-model="value.tmpPhoneStatus" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="findRequest"
            >
                FindRequest
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'FindRequestCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.id = 0;
            this.value.userId = '';
            this.value.imei = '';
            this.value.gps = '';
            this.value.lockState = '';
            this.value.status = '';
            this.value.lostAt = '2025-03-06';
            this.value.tmpPhoneImei = '';
            this.value.tmpPhoneStatus = '';
        },
        watch: {
        },
        methods: {
            findRequest() {
                this.$emit('findRequest', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

