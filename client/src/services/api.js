import axios from 'axios';

const API_URL = 'http://localhost:8080';

export const getAllInvoices = async () => {
    try {
        const response = await axios.get(`${API_URL}/invoice`);
        return response.data; // Return the data from the response
    } catch (error) {
        console.error('Error fetching invoices:', error);
        throw error; // Throw the error for the caller to handle
    }
}

export const saveInvoice = async (payload) => {
    try {
        const response = await axios.post(`${API_URL}/invoice`, payload);
        return response.data; // Return the data from the response if successful
    } catch (error) {
        console.error('Error saving invoice:', error);
        throw error; // Throw the error for the caller to handle
    }
}

export const deleteInvoice = async (id) => {
    try {
        const response = await axios.delete(`${API_URL}/invoice/${id}`);
        return response.data; // Return the data from the response if successful
    } catch (error) {
        console.error('Error deleting invoice:', error);
        throw error; // Throw the error for the caller to handle
    }
}

export default {
    getAllInvoices,
    saveInvoice,
    deleteInvoice
};
